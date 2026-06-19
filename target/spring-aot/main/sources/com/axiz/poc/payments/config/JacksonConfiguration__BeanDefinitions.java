package com.axiz.poc.payments.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link JacksonConfiguration}.
 */
@Generated
public class JacksonConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'jacksonConfiguration'.
   */
  public static BeanDefinition getJacksonConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonConfiguration.class);
    beanDefinition.setTargetType(JacksonConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(JacksonConfiguration.class);
    beanDefinition.setInstanceSupplier(JacksonConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'objectMapper'.
   */
  private static BeanInstanceSupplier<ObjectMapper> getObjectMapperInstanceSupplier() {
    return BeanInstanceSupplier.<ObjectMapper>forFactoryMethod(JacksonConfiguration$$SpringCGLIB$$0.class, "objectMapper")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("jacksonConfiguration", JacksonConfiguration.class).objectMapper());
  }

  /**
   * Get the bean definition for 'objectMapper'.
   */
  public static BeanDefinition getObjectMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ObjectMapper.class);
    beanDefinition.setFactoryBeanName("jacksonConfiguration");
    beanDefinition.setInstanceSupplier(getObjectMapperInstanceSupplier());
    return beanDefinition;
  }
}
