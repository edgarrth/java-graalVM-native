package com.axiz.poc.payments.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean
    public DataSource dataSource(Environment env) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(env.getProperty("spring.datasource.url", "jdbc:postgresql://localhost:5432/payments"));
        config.setUsername(env.getProperty("spring.datasource.username", "payments"));
        config.setPassword(env.getProperty("spring.datasource.password", "payments"));
        config.setDriverClassName("org.postgresql.Driver");
        return new HikariDataSource(config);
    }
}