package com.axiz.poc.payments.application.port.out;

import com.axiz.poc.payments.domain.model.PaymentMethod;
import java.util.Optional;

public interface PaymentMethodRepository { Optional<PaymentMethod> findByToken(String token); }
