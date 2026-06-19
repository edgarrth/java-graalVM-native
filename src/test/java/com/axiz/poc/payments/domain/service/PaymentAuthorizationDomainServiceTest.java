package com.axiz.poc.payments.domain.service;

import com.axiz.poc.payments.domain.model.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.Currency;
import static org.assertj.core.api.Assertions.assertThat;

class PaymentAuthorizationDomainServiceTest {
    @Test void authorizeEnabledMerchantAndMethod() {
        var service = new PaymentAuthorizationDomainService();
        var payment = service.authorize(new Merchant("m-001", "Demo", true), new PaymentMethod("tok_visa", "VISA", "4242", true), new Money(BigDecimal.TEN, Currency.getInstance("PEN")), "idem-1");
        assertThat(payment.status()).isEqualTo(PaymentStatus.AUTHORIZED);
        assertThat(payment.authorizationCode()).startsWith("AUTH-");
    }
}
