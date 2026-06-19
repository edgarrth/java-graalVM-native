package com.axiz.poc.payments.adapter.out.persistence;

import com.axiz.poc.payments.application.port.out.MerchantRepository;
import com.axiz.poc.payments.domain.model.Merchant;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public class JdbcMerchantRepositoryAdapter implements MerchantRepository {
    private final JdbcClient jdbc;
    public JdbcMerchantRepositoryAdapter(JdbcClient jdbc) { this.jdbc = jdbc; }
    public Optional<Merchant> findById(String id) {
        return jdbc.sql("select merchant_id, name, active from merchants where merchant_id = :id")
                .param("id", id)
                .query((rs, rowNum) -> new Merchant(rs.getString("merchant_id"), rs.getString("name"), rs.getBoolean("active")))
                .optional();
    }
}
