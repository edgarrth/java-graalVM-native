package com.axiz.poc.payments.config;

import javax.sql.DataSource;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.env.Environment;

/**
 * Bean definitions for {@link DataSourceConfiguration}.
 */
@Generated
public class DataSourceConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'dataSourceConfiguration'.
   */
  public static BeanDefinition getDataSourceConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSourceConfiguration.class);
    beanDefinition.setTargetType(DataSourceConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(DataSourceConfiguration.class);
    beanDefinition.setInstanceSupplier(DataSourceConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dataSource'.
   */
  private static BeanInstanceSupplier<DataSource> getDataSourceInstanceSupplier() {
    return BeanInstanceSupplier.<DataSource>forFactoryMethod(DataSourceConfiguration$$SpringCGLIB$$0.class, "dataSource", Environment.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("dataSourceConfiguration", DataSourceConfiguration.class).dataSource(args.get(0)));
  }

  /**
   * Get the bean definition for 'dataSource'.
   */
  public static BeanDefinition getDataSourceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSource.class);
    beanDefinition.setFactoryBeanName("dataSourceConfiguration");
    beanDefinition.setInstanceSupplier(getDataSourceInstanceSupplier());
    return beanDefinition;
  }
}
