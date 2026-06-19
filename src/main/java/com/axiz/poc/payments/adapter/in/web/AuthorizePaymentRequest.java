package com.axiz.poc.payments.adapter.in.web;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record AuthorizePaymentRequest(
        @NotBlank String merchantId,
        @NotBlank String paymentMethodToken,
        @NotNull @DecimalMin(value = "0.01") BigDecimal amount,
        @NotBlank @Size(min = 3, max = 3) String currency,
        @NotBlank String idempotencyKey
) {}
