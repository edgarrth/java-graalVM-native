package com.axiz.poc.payments.adapter.out.persistence;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.jdbc.core.simple.JdbcClient;

/**
 * Bean definitions for {@link JdbcMerchantRepositoryAdapter}.
 */
@Generated
public class JdbcMerchantRepositoryAdapter__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'jdbcMerchantRepositoryAdapter'.
   */
  private static BeanInstanceSupplier<JdbcMerchantRepositoryAdapter> getJdbcMerchantRepositoryAdapterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JdbcMerchantRepositoryAdapter>forConstructor(JdbcClient.class)
            .withGenerator((registeredBean, args) -> new JdbcMerchantRepositoryAdapter(args.get(0)));
  }

  /**
   * Get the bean definition for 'jdbcMerchantRepositoryAdapter'.
   */
  public static BeanDefinition getJdbcMerchantRepositoryAdapterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JdbcMerchantRepositoryAdapter.class);
    beanDefinition.setInstanceSupplier(getJdbcMerchantRepositoryAdapterInstanceSupplier());
    return beanDefinition;
  }
}
