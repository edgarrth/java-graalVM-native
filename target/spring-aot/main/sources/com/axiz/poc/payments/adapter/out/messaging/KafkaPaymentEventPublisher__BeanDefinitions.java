package com.axiz.poc.payments.adapter.out.messaging;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.String;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * Bean definitions for {@link KafkaPaymentEventPublisher}.
 */
@Generated
public class KafkaPaymentEventPublisher__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'kafkaPaymentEventPublisher'.
   */
  private static BeanInstanceSupplier<KafkaPaymentEventPublisher> getKafkaPaymentEventPublisherInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaPaymentEventPublisher>forConstructor(KafkaTemplate.class, ObjectMapper.class, String.class)
            .withGenerator((registeredBean, args) -> new KafkaPaymentEventPublisher(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'kafkaPaymentEventPublisher'.
   */
  public static BeanDefinition getKafkaPaymentEventPublisherBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KafkaPaymentEventPublisher.class);
    beanDefinition.setInstanceSupplier(getKafkaPaymentEventPublisherInstanceSupplier());
    return beanDefinition;
  }
}
