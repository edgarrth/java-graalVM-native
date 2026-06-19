package com.axiz.poc.payments.domain.service;

import com.axiz.poc.payments.domain.model.*;

public class PaymentAuthorizationDomainService {
    public Payment authorize(Merchant merchant, PaymentMethod method, Money money, String idempotencyKey) {
        if (merchant == null || !merchant.active()) throw new IllegalStateException("merchant is inactive or does not exist");
        if (method == null || !method.enabled()) throw new IllegalStateException("payment method is disabled or does not exist");
        return Payment.authorize(merchant.id(), method.token(), money, idempotencyKey);
    }
}
