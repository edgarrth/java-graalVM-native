package com.axiz.poc.payments.adapter.out.persistence;

import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
import java.util.UUID;

interface SpringDataPaymentJdbcRepository extends CrudRepository<PaymentRow, UUID> { Optional<PaymentRow> findByIdempotencyKey(String idempotencyKey); }
