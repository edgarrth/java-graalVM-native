package org.springframework.kafka.annotation;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link KafkaListenerAnnotationBeanPostProcessor}.
 */
@Generated
public class KafkaListenerAnnotationBeanPostProcessor__BeanDefinitions {
  /**
   * Get the bean definition for 'internalKafkaListenerAnnotationProcessor'.
   */
  public static BeanDefinition getInternalKafkaListenerAnnotationProcessorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KafkaListenerAnnotationBeanPostProcessor.class);
    beanDefinition.setTargetType(ResolvableType.forClass(KafkaListenerAnnotationBeanPostProcessor.class));
    beanDefinition.setInstanceSupplier(KafkaListenerAnnotationBeanPostProcessor::new);
    return beanDefinition;
  }
}
