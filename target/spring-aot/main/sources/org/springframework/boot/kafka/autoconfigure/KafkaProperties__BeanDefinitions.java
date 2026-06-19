package org.springframework.boot.kafka.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link KafkaProperties}.
 */
@Generated
public class KafkaProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'kafkaProperties'.
   */
  public static BeanDefinition getKafkaPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KafkaProperties.class);
    beanDefinition.setInstanceSupplier(KafkaProperties::new);
    return beanDefinition;
  }
}
