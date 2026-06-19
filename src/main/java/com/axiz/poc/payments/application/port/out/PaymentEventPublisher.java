package com.axiz.poc.payments.application.port.out;

import com.axiz.poc.payments.domain.event.PaymentAuthorizedEvent;

public interface PaymentEventPublisher { void publish(PaymentAuthorizedEvent event); }
