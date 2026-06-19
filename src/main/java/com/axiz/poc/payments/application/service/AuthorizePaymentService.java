package com.axiz.poc.payments.application.service;

import com.axiz.poc.payments.application.port.in.*;
import com.axiz.poc.payments.application.port.out.*;
import com.axiz.poc.payments.domain.event.PaymentAuthorizedEvent;
import com.axiz.poc.payments.domain.model.Money;
import com.axiz.poc.payments.domain.service.PaymentAuthorizationDomainService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Currency;

@Service
public class AuthorizePaymentService implements AuthorizePaymentUseCase {
    private final PaymentRepository payments;
    private final MerchantRepository merchants;
    private final PaymentMethodRepository methods;
    private final PaymentEventPublisher events;
    private final PaymentAuthorizationDomainService domainService = new PaymentAuthorizationDomainService();

    public AuthorizePaymentService(PaymentRepository payments, MerchantRepository merchants, PaymentMethodRepository methods, PaymentEventPublisher events) {
        this.payments = payments;
        this.merchants = merchants;
        this.methods = methods;
        this.events = events;
    }

    @Override
    @Transactional
    public PaymentResult authorize(AuthorizePaymentCommand command) {
        return payments.findByIdempotencyKey(command.idempotencyKey()).map(this::toResult).orElseGet(() -> create(command));
    }

    private PaymentResult create(AuthorizePaymentCommand command) {
        var merchant = merchants.findById(command.merchantId()).orElseThrow(() -> new IllegalArgumentException("merchant not found"));
        var method = methods.findByToken(command.paymentMethodToken()).orElseThrow(() -> new IllegalArgumentException("payment method not found"));
        var payment = domainService.authorize(merchant, method, new Money(command.amount(), Currency.getInstance(command.currency())), command.idempotencyKey());
        var saved = payments.save(payment);
        events.publish(new PaymentAuthorizedEvent(saved.id(), saved.merchantId(), saved.money().amount(), saved.money().currency().getCurrencyCode(), saved.authorizationCode(), saved.createdAt()));
        return toResult(saved);
    }

    private PaymentResult toResult(com.axiz.poc.payments.domain.model.Payment p) {
        return new PaymentResult(p.id(), p.status().name(), p.authorizationCode(), p.money().amount(), p.money().currency().getCurrencyCode(), p.createdAt());
    }
}
