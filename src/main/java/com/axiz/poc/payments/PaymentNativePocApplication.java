package com.axiz.poc.payments;

import com.axiz.poc.payments.domain.event.PaymentAuthorizedEvent;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RegisterReflectionForBinding(PaymentAuthorizedEvent.class)
@SpringBootApplication
public class PaymentNativePocApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentNativePocApplication.class, args);
    }
}
