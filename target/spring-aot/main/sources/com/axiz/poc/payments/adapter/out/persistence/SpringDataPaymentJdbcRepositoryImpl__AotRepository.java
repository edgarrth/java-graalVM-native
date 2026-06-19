package com.axiz.poc.payments.adapter.out.persistence;

import java.lang.Object;
import java.lang.String;
import java.util.Optional;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jdbc.core.JdbcAggregateOperations;
import org.springframework.data.jdbc.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jdbc.repository.query.RowMapperFactory;
import org.springframework.data.jdbc.repository.query.StatementFactory;
import org.springframework.data.relational.core.query.Criteria;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;
import org.springframework.jdbc.core.RowMapper;

/**
 * AOT generated JDBC repository implementation for {@link SpringDataPaymentJdbcRepository}.
 */
@Generated
public class SpringDataPaymentJdbcRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  public SpringDataPaymentJdbcRepositoryImpl__AotRepository(JdbcAggregateOperations operations,
      RowMapperFactory rowMapperFactory,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(operations, rowMapperFactory, context);
  }

  /**
   * AOT generated implementation of {@link SpringDataPaymentJdbcRepository#findByIdempotencyKey(java.lang.String)}.
   */
  public Optional<PaymentRow> findByIdempotencyKey(String idempotencyKey) {
    Criteria criteria = Criteria.where("idempotencyKey").is(idempotencyKey);
    StatementFactory.SelectionBuilder builder = getStatementFactory().select(PaymentRow.class).filter(criteria);

    RowMapper rowMapper = getRowMapperFactory().create(PaymentRow.class);
    Object result = builder.executeWith((sql, paramSource) -> queryForObject(sql, paramSource, rowMapper));
    return (Optional) Optional.ofNullable(convertOne(result, PaymentRow.class));
  }
}
