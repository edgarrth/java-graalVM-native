package com.axiz.poc.payments.application.port.in;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public record PaymentResult(UUID paymentId, String status, String authorizationCode, BigDecimal amount,
                            String currency, OffsetDateTime createdAt) {}
