package com.axiz.poc.payments.adapter.out.persistence;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.jdbc.core.simple.JdbcClient;

/**
 * Bean definitions for {@link JdbcPaymentMethodRepositoryAdapter}.
 */
@Generated
public class JdbcPaymentMethodRepositoryAdapter__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'jdbcPaymentMethodRepositoryAdapter'.
   */
  private static BeanInstanceSupplier<JdbcPaymentMethodRepositoryAdapter> getJdbcPaymentMethodRepositoryAdapterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JdbcPaymentMethodRepositoryAdapter>forConstructor(JdbcClient.class)
            .withGenerator((registeredBean, args) -> new JdbcPaymentMethodRepositoryAdapter(args.get(0)));
  }

  /**
   * Get the bean definition for 'jdbcPaymentMethodRepositoryAdapter'.
   */
  public static BeanDefinition getJdbcPaymentMethodRepositoryAdapterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JdbcPaymentMethodRepositoryAdapter.class);
    beanDefinition.setInstanceSupplier(getJdbcPaymentMethodRepositoryAdapterInstanceSupplier());
    return beanDefinition;
  }
}
