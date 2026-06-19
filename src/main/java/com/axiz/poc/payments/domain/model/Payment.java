package com.axiz.poc.payments.domain.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Payment {
    private final UUID id;
    private final String merchantId;
    private final String methodToken;
    private final Money money;
    private PaymentStatus status;
    private String authorizationCode;
    private final String idempotencyKey;
    private final OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    private Payment(UUID id, String merchantId, String methodToken, Money money, PaymentStatus status,
                    String authorizationCode, String idempotencyKey, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        this.id = id; this.merchantId = merchantId; this.methodToken = methodToken; this.money = money;
        this.status = status; this.authorizationCode = authorizationCode; this.idempotencyKey = idempotencyKey;
        this.createdAt = createdAt; this.updatedAt = updatedAt;
    }

    public static Payment authorize(String merchantId, String methodToken, Money money, String idempotencyKey) {
        if (merchantId == null || merchantId.isBlank()) throw new IllegalArgumentException("merchantId is required");
        if (methodToken == null || methodToken.isBlank()) throw new IllegalArgumentException("paymentMethodToken is required");
        if (idempotencyKey == null || idempotencyKey.isBlank()) throw new IllegalArgumentException("idempotencyKey is required");
        var now = OffsetDateTime.now();
        var code = "AUTH-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        return new Payment(UUID.randomUUID(), merchantId, methodToken, money, PaymentStatus.AUTHORIZED, code, idempotencyKey, now, now);
    }

    public static Payment restore(UUID id, String merchantId, String methodToken, Money money, PaymentStatus status,
                                  String authorizationCode, String idempotencyKey, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        return new Payment(id, merchantId, methodToken, money, status, authorizationCode, idempotencyKey, createdAt, updatedAt);
    }

    public UUID id() { return id; }
    public String merchantId() { return merchantId; }
    public String methodToken() { return methodToken; }
    public Money money() { return money; }
    public PaymentStatus status() { return status; }
    public String authorizationCode() { return authorizationCode; }
    public String idempotencyKey() { return idempotencyKey; }
    public OffsetDateTime createdAt() { return createdAt; }
    public OffsetDateTime updatedAt() { return updatedAt; }
}
