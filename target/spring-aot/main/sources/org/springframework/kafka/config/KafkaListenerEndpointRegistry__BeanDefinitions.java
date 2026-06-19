package org.springframework.kafka.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link KafkaListenerEndpointRegistry}.
 */
@Generated
public class KafkaListenerEndpointRegistry__BeanDefinitions {
  /**
   * Get the bean definition for 'internalKafkaListenerEndpointRegistry'.
   */
  public static BeanDefinition getInternalKafkaListenerEndpointRegistryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KafkaListenerEndpointRegistry.class);
    beanDefinition.setInstanceSupplier(KafkaListenerEndpointRegistry::new);
    return beanDefinition;
  }
}
