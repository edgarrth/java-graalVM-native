package org.springframework.boot.kafka.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;

/**
 * Bean definitions for {@link KafkaAnnotationDrivenConfiguration}.
 */
@Generated
public class KafkaAnnotationDrivenConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.kafka.autoconfigure.KafkaAnnotationDrivenConfiguration'.
   */
  private static BeanInstanceSupplier<KafkaAnnotationDrivenConfiguration> getKafkaAnnotationDrivenConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaAnnotationDrivenConfiguration>forConstructor(KafkaProperties.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> new KafkaAnnotationDrivenConfiguration(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5), args.get(6), args.get(7), args.get(8), args.get(9), args.get(10), args.get(11), args.get(12)));
  }

  /**
   * Get the bean definition for 'kafkaAnnotationDrivenConfiguration'.
   */
  public static BeanDefinition getKafkaAnnotationDrivenConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KafkaAnnotationDrivenConfiguration.class);
    beanDefinition.setInstanceSupplier(getKafkaAnnotationDrivenConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaListenerContainerFactoryConfigurer'.
   */
  private static BeanInstanceSupplier<ConcurrentKafkaListenerContainerFactoryConfigurer> getKafkaListenerContainerFactoryConfigurerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ConcurrentKafkaListenerContainerFactoryConfigurer>forFactoryMethod(KafkaAnnotationDrivenConfiguration.class, "kafkaListenerContainerFactoryConfigurer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.kafka.autoconfigure.KafkaAnnotationDrivenConfiguration", KafkaAnnotationDrivenConfiguration.class).kafkaListenerContainerFactoryConfigurer());
  }

  /**
   * Get the bean definition for 'kafkaListenerContainerFactoryConfigurer'.
   */
  public static BeanDefinition getKafkaListenerContainerFactoryConfigurerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ConcurrentKafkaListenerContainerFactoryConfigurer.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.kafka.autoconfigure.KafkaAnnotationDrivenConfiguration");
    beanDefinition.setInstanceSupplier(getKafkaListenerContainerFactoryConfigurerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaListenerContainerFactory'.
   */
  private static BeanInstanceSupplier<ConcurrentKafkaListenerContainerFactory> getKafkaListenerContainerFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ConcurrentKafkaListenerContainerFactory>forFactoryMethod(KafkaAnnotationDrivenConfiguration.class, "kafkaListenerContainerFactory", ConcurrentKafkaListenerContainerFactoryConfigurer.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.kafka.autoconfigure.KafkaAnnotationDrivenConfiguration", KafkaAnnotationDrivenConfiguration.class).kafkaListenerContainerFactory(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'kafkaListenerContainerFactory'.
   */
  public static BeanDefinition getKafkaListenerContainerFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ConcurrentKafkaListenerContainerFactory.class);
    beanDefinition.setTargetType(ResolvableType.forClass(ConcurrentKafkaListenerContainerFactory.class));
    beanDefinition.setFactoryBeanName("org.springframework.boot.kafka.autoconfigure.KafkaAnnotationDrivenConfiguration");
    beanDefinition.setInstanceSupplier(getKafkaListenerContainerFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link KafkaAnnotationDrivenConfiguration.EnableKafkaConfiguration}.
   */
  @Generated
  public static class EnableKafkaConfiguration {
    /**
     * Get the bean definition for 'enableKafkaConfiguration'.
     */
    public static BeanDefinition getEnableKafkaConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(KafkaAnnotationDrivenConfiguration.EnableKafkaConfiguration.class);
      beanDefinition.setInstanceSupplier(KafkaAnnotationDrivenConfiguration.EnableKafkaConfiguration::new);
      return beanDefinition;
    }
  }
}
