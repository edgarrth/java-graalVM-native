package com.axiz.poc.payments.application.port.in;

public interface AuthorizePaymentUseCase { PaymentResult authorize(AuthorizePaymentCommand command); }
