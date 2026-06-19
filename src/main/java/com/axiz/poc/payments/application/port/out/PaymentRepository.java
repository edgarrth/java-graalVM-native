package com.axiz.poc.payments.application.port.out;

import com.axiz.poc.payments.domain.model.Payment;
import java.util.Optional;

public interface PaymentRepository {
    Optional<Payment> findByIdempotencyKey(String idempotencyKey);
    Payment save(Payment payment);
}
