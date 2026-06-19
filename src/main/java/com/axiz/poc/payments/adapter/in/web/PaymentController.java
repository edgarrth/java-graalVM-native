package com.axiz.poc.payments.adapter.in.web;

import com.axiz.poc.payments.application.port.in.*;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {
    private final AuthorizePaymentUseCase useCase;
    public PaymentController(AuthorizePaymentUseCase useCase) { this.useCase = useCase; }

    @PostMapping("/authorizations")
    @ResponseStatus(HttpStatus.CREATED)
    public PaymentResult authorize(@Valid @RequestBody AuthorizePaymentRequest request) {
        return useCase.authorize(new AuthorizePaymentCommand(request.merchantId(), request.paymentMethodToken(), request.amount(), request.currency(), request.idempotencyKey()));
    }
}
