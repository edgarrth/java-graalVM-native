package org.springframework.boot.kafka.autoconfigure;

import java.lang.Object;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.LoggingProducerListener;
import org.springframework.kafka.support.ProducerListener;

/**
 * Bean definitions for {@link KafkaAutoConfiguration}.
 */
@Generated
public class KafkaAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.kafka.autoconfigure.KafkaAutoConfiguration'.
   */
  private static BeanInstanceSupplier<KafkaAutoConfiguration> getKafkaAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaAutoConfiguration>forConstructor(KafkaProperties.class)
            .withGenerator((registeredBean, args) -> new KafkaAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'kafkaAutoConfiguration'.
   */
  public static BeanDefinition getKafkaAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KafkaAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(getKafkaAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaConnectionDetails'.
   */
  private static BeanInstanceSupplier<PropertiesKafkaConnectionDetails> getKafkaConnectionDetailsInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PropertiesKafkaConnectionDetails>forFactoryMethod(KafkaAutoConfiguration.class, "kafkaConnectionDetails", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.kafka.autoconfigure.KafkaAutoConfiguration", KafkaAutoConfiguration.class).kafkaConnectionDetails(args.get(0)));
  }

  /**
   * Get the bean definition for 'kafkaConnectionDetails'.
   */
  public static BeanDefinition getKafkaConnectionDetailsBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PropertiesKafkaConnectionDetails.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.kafka.autoconfigure.KafkaAutoConfiguration");
    beanDefinition.setInstanceSupplier(getKafkaConnectionDetailsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaTemplate'.
   */
  private static BeanInstanceSupplier<KafkaTemplate> getKafkaTemplateInstanceSupplier() {
    return BeanInstanceSupplier.<KafkaTemplate>forFactoryMethod(KafkaAutoConfiguration.class, "kafkaTemplate", ProducerFactory.class, ProducerListener.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.kafka.autoconfigure.KafkaAutoConfiguration", KafkaAutoConfiguration.class).kafkaTemplate(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'kafkaTemplate'.
   */
  public static BeanDefinition getKafkaTemplateBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KafkaTemplate.class);
    beanDefinition.setTargetType(ResolvableType.forClass(KafkaTemplate.class));
    beanDefinition.setFactoryBeanName("org.springframework.boot.kafka.autoconfigure.KafkaAutoConfiguration");
    beanDefinition.setInstanceSupplier(getKafkaTemplateInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaProducerListener'.
   */
  private static BeanInstanceSupplier<LoggingProducerListener> getKafkaProducerListenerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LoggingProducerListener>forFactoryMethod(KafkaAutoConfiguration.class, "kafkaProducerListener")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.kafka.autoconfigure.KafkaAutoConfiguration", KafkaAutoConfiguration.class).kafkaProducerListener());
  }

  /**
   * Get the bean definition for 'kafkaProducerListener'.
   */
  public static BeanDefinition getKafkaProducerListenerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LoggingProducerListener.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(LoggingProducerListener.class, Object.class, Object.class));
    beanDefinition.setFactoryBeanName("org.springframework.boot.kafka.autoconfigure.KafkaAutoConfiguration");
    beanDefinition.setInstanceSupplier(getKafkaProducerListenerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaConsumerFactory'.
   */
  private static BeanInstanceSupplier<DefaultKafkaConsumerFactory> getKafkaConsumerFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultKafkaConsumerFactory>forFactoryMethod(KafkaAutoConfiguration.class, "kafkaConsumerFactory", KafkaConnectionDetails.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.kafka.autoconfigure.KafkaAutoConfiguration", KafkaAutoConfiguration.class).kafkaConsumerFactory(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'kafkaConsumerFactory'.
   */
  public static BeanDefinition getKafkaConsumerFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultKafkaConsumerFactory.class);
    beanDefinition.setTargetType(ResolvableType.forClass(DefaultKafkaConsumerFactory.class));
    beanDefinition.setFactoryBeanName("org.springframework.boot.kafka.autoconfigure.KafkaAutoConfiguration");
    beanDefinition.setInstanceSupplier(getKafkaConsumerFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaProducerFactory'.
   */
  private static BeanInstanceSupplier<DefaultKafkaProducerFactory> getKafkaProducerFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultKafkaProducerFactory>forFactoryMethod(KafkaAutoConfiguration.class, "kafkaProducerFactory", KafkaConnectionDetails.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.kafka.autoconfigure.KafkaAutoConfiguration", KafkaAutoConfiguration.class).kafkaProducerFactory(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'kafkaProducerFactory'.
   */
  public static BeanDefinition getKafkaProducerFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultKafkaProducerFactory.class);
    beanDefinition.setTargetType(ResolvableType.forClass(DefaultKafkaProducerFactory.class));
    beanDefinition.setFactoryBeanName("org.springframework.boot.kafka.autoconfigure.KafkaAutoConfiguration");
    beanDefinition.setInstanceSupplier(getKafkaProducerFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaAdmin'.
   */
  private static BeanInstanceSupplier<KafkaAdmin> getKafkaAdminInstanceSupplier() {
    return BeanInstanceSupplier.<KafkaAdmin>forFactoryMethod(KafkaAutoConfiguration.class, "kafkaAdmin", KafkaConnectionDetails.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.kafka.autoconfigure.KafkaAutoConfiguration", KafkaAutoConfiguration.class).kafkaAdmin(args.get(0)));
  }

  /**
   * Get the bean definition for 'kafkaAdmin'.
   */
  public static BeanDefinition getKafkaAdminBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KafkaAdmin.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.kafka.autoconfigure.KafkaAutoConfiguration");
    beanDefinition.setInstanceSupplier(getKafkaAdminInstanceSupplier());
    return beanDefinition;
  }
}
