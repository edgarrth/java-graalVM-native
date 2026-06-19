package com.axiz.poc.payments;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PaymentNativePocApplication}.
 */
@Generated
public class PaymentNativePocApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'paymentNativePocApplication'.
   */
  public static BeanDefinition getPaymentNativePocApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PaymentNativePocApplication.class);
    beanDefinition.setInstanceSupplier(PaymentNativePocApplication::new);
    return beanDefinition;
  }
}
