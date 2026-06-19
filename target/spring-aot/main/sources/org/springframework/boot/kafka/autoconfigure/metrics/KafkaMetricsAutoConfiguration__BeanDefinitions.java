package org.springframework.boot.kafka.autoconfigure.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.kafka.autoconfigure.DefaultKafkaConsumerFactoryCustomizer;
import org.springframework.boot.kafka.autoconfigure.DefaultKafkaProducerFactoryCustomizer;
import org.springframework.kafka.config.StreamsBuilderFactoryBeanConfigurer;

/**
 * Bean definitions for {@link KafkaMetricsAutoConfiguration}.
 */
@Generated
public class KafkaMetricsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'kafkaMetricsAutoConfiguration'.
   */
  public static BeanDefinition getKafkaMetricsAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KafkaMetricsAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(KafkaMetricsAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaProducerMetrics'.
   */
  private static BeanInstanceSupplier<DefaultKafkaProducerFactoryCustomizer> getKafkaProducerMetricsInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultKafkaProducerFactoryCustomizer>forFactoryMethod(KafkaMetricsAutoConfiguration.class, "kafkaProducerMetrics", MeterRegistry.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.kafka.autoconfigure.metrics.KafkaMetricsAutoConfiguration", KafkaMetricsAutoConfiguration.class).kafkaProducerMetrics(args.get(0)));
  }

  /**
   * Get the bean definition for 'kafkaProducerMetrics'.
   */
  public static BeanDefinition getKafkaProducerMetricsBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultKafkaProducerFactoryCustomizer.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.kafka.autoconfigure.metrics.KafkaMetricsAutoConfiguration");
    beanDefinition.setInstanceSupplier(getKafkaProducerMetricsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaConsumerMetrics'.
   */
  private static BeanInstanceSupplier<DefaultKafkaConsumerFactoryCustomizer> getKafkaConsumerMetricsInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultKafkaConsumerFactoryCustomizer>forFactoryMethod(KafkaMetricsAutoConfiguration.class, "kafkaConsumerMetrics", MeterRegistry.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.kafka.autoconfigure.metrics.KafkaMetricsAutoConfiguration", KafkaMetricsAutoConfiguration.class).kafkaConsumerMetrics(args.get(0)));
  }

  /**
   * Get the bean definition for 'kafkaConsumerMetrics'.
   */
  public static BeanDefinition getKafkaConsumerMetricsBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultKafkaConsumerFactoryCustomizer.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.kafka.autoconfigure.metrics.KafkaMetricsAutoConfiguration");
    beanDefinition.setInstanceSupplier(getKafkaConsumerMetricsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link KafkaMetricsAutoConfiguration.KafkaStreamsMetricsConfiguration}.
   */
  @Generated
  public static class KafkaStreamsMetricsConfiguration {
    /**
     * Get the bean definition for 'kafkaStreamsMetricsConfiguration'.
     */
    public static BeanDefinition getKafkaStreamsMetricsConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(KafkaMetricsAutoConfiguration.KafkaStreamsMetricsConfiguration.class);
      beanDefinition.setInstanceSupplier(KafkaMetricsAutoConfiguration.KafkaStreamsMetricsConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'kafkaStreamsMetrics'.
     */
    private static BeanInstanceSupplier<StreamsBuilderFactoryBeanConfigurer> getKafkaStreamsMetricsInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<StreamsBuilderFactoryBeanConfigurer>forFactoryMethod(KafkaMetricsAutoConfiguration.KafkaStreamsMetricsConfiguration.class, "kafkaStreamsMetrics", MeterRegistry.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.kafka.autoconfigure.metrics.KafkaMetricsAutoConfiguration$KafkaStreamsMetricsConfiguration", KafkaMetricsAutoConfiguration.KafkaStreamsMetricsConfiguration.class).kafkaStreamsMetrics(args.get(0)));
    }

    /**
     * Get the bean definition for 'kafkaStreamsMetrics'.
     */
    public static BeanDefinition getKafkaStreamsMetricsBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(StreamsBuilderFactoryBeanConfigurer.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.kafka.autoconfigure.metrics.KafkaMetricsAutoConfiguration$KafkaStreamsMetricsConfiguration");
      beanDefinition.setInstanceSupplier(getKafkaStreamsMetricsInstanceSupplier());
      return beanDefinition;
    }
  }
}
