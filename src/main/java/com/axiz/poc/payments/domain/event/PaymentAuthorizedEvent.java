package com.axiz.poc.payments.domain.event;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public record PaymentAuthorizedEvent(UUID paymentId, String merchantId, BigDecimal amount, String currency,
                                     String authorizationCode, OffsetDateTime occurredAt) {}
