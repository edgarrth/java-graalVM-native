package com.axiz.poc.payments.adapter.out.persistence;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JdbcPaymentRepositoryAdapter}.
 */
@Generated
public class JdbcPaymentRepositoryAdapter__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'jdbcPaymentRepositoryAdapter'.
   */
  private static BeanInstanceSupplier<JdbcPaymentRepositoryAdapter> getJdbcPaymentRepositoryAdapterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JdbcPaymentRepositoryAdapter>forConstructor(SpringDataPaymentJdbcRepository.class)
            .withGenerator((registeredBean, args) -> new JdbcPaymentRepositoryAdapter(args.get(0)));
  }

  /**
   * Get the bean definition for 'jdbcPaymentRepositoryAdapter'.
   */
  public static BeanDefinition getJdbcPaymentRepositoryAdapterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JdbcPaymentRepositoryAdapter.class);
    beanDefinition.setInstanceSupplier(getJdbcPaymentRepositoryAdapterInstanceSupplier());
    return beanDefinition;
  }
}
