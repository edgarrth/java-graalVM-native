package com.axiz.poc.payments.adapter.out.persistence;

import com.axiz.poc.payments.application.port.out.PaymentRepository;
import com.axiz.poc.payments.domain.model.*;
import org.springframework.stereotype.Repository;
import java.util.Currency;
import java.util.Optional;

@Repository
public class JdbcPaymentRepositoryAdapter implements PaymentRepository {
    private final SpringDataPaymentJdbcRepository repository;
    public JdbcPaymentRepositoryAdapter(SpringDataPaymentJdbcRepository repository) { this.repository = repository; }
    public Optional<Payment> findByIdempotencyKey(String key) { return repository.findByIdempotencyKey(key).map(this::toDomain); }
    public Payment save(Payment p) { return toDomain(repository.save(toRow(p))); }
    private PaymentRow toRow(Payment p) { return new PaymentRow(p.id(), p.merchantId(), p.methodToken(), p.money().amount(), p.money().currency().getCurrencyCode(), p.status().name(), p.authorizationCode(), p.idempotencyKey(), p.createdAt(), p.updatedAt()); }
    private Payment toDomain(PaymentRow r) { return Payment.restore(r.paymentId(), r.merchantId(), r.methodToken(), new Money(r.amount(), Currency.getInstance(r.currency())), PaymentStatus.valueOf(r.status()), r.authorizationCode(), r.idempotencyKey(), r.createdAt(), r.updatedAt()); }
}
