package com.axiz.poc.payments.application.port.in;

import java.math.BigDecimal;

public record AuthorizePaymentCommand(String merchantId, String paymentMethodToken, BigDecimal amount,
                                      String currency, String idempotencyKey) {}
