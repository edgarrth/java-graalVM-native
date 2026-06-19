package com.axiz.poc.payments.adapter.out.persistence;

import com.axiz.poc.payments.application.port.out.PaymentMethodRepository;
import com.axiz.poc.payments.domain.model.PaymentMethod;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public class JdbcPaymentMethodRepositoryAdapter implements PaymentMethodRepository {
    private final JdbcClient jdbc;
    public JdbcPaymentMethodRepositoryAdapter(JdbcClient jdbc) { this.jdbc = jdbc; }
    public Optional<PaymentMethod> findByToken(String token) {
        return jdbc.sql("select token, brand, last_four, enabled from payment_methods where token = :token")
                .param("token", token)
                .query((rs, rowNum) -> new PaymentMethod(rs.getString("token"), rs.getString("brand"), rs.getString("last_four"), rs.getBoolean("enabled")))
                .optional();
    }
}
