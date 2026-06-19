package com.axiz.poc.payments.adapter.in.web;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ApiExceptionHandler}.
 */
@Generated
public class ApiExceptionHandler__BeanDefinitions {
  /**
   * Get the bean definition for 'apiExceptionHandler'.
   */
  public static BeanDefinition getApiExceptionHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ApiExceptionHandler.class);
    beanDefinition.setInstanceSupplier(ApiExceptionHandler::new);
    return beanDefinition;
  }
}
