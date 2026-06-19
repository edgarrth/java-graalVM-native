package com.axiz.poc.payments.domain.model;

public record PaymentMethod(String token, String brand, String lastFour, boolean enabled) {}
