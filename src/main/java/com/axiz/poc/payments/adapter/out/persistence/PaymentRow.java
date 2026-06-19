package com.axiz.poc.payments.adapter.out.persistence;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Table("payments")
public record PaymentRow(@Id UUID paymentId, String merchantId, String methodToken, BigDecimal amount, String currency,
                         String status, String authorizationCode, String idempotencyKey, OffsetDateTime createdAt, OffsetDateTime updatedAt) {}
