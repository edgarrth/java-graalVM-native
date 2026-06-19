package com.axiz.poc.payments.adapter.out.persistence;

import java.lang.Class;
import java.util.UUID;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;
import org.springframework.data.jdbc.core.JdbcAggregateOperations;
import org.springframework.data.jdbc.core.convert.QueryMappingConfiguration;
import org.springframework.data.jdbc.repository.support.BeanFactoryAwareRowMapperFactory;
import org.springframework.data.jdbc.repository.support.JdbcRepositoryFactoryBean;
import org.springframework.data.repository.core.support.RepositoryComposition;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;
import org.springframework.data.repository.query.QueryLookupStrategy;

/**
 * Bean definitions for {@link SpringDataPaymentJdbcRepository}.
 */
@Generated
public class SpringDataPaymentJdbcRepository__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'springDataPaymentJdbcRepository'.
   */
  private static BeanInstanceSupplier<JdbcRepositoryFactoryBean> getSpringDataPaymentJdbcRepositoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JdbcRepositoryFactoryBean>forConstructor(Class.class)
            .withGenerator((registeredBean, args) -> new JdbcRepositoryFactoryBean(args.get(0)));
  }

  /**
   * Get the bean definition for 'springDataPaymentJdbcRepository'.
   */
  public static BeanDefinition getSpringDataPaymentJdbcRepositoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JdbcRepositoryFactoryBean.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(JdbcRepositoryFactoryBean.class, SpringDataPaymentJdbcRepository.class, PaymentRow.class, UUID.class));
    beanDefinition.setLazyInit(false);
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, "com.axiz.poc.payments.adapter.out.persistence.SpringDataPaymentJdbcRepository");
    beanDefinition.getPropertyValues().addPropertyValue("queryLookupStrategyKey", QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND);
    beanDefinition.getPropertyValues().addPropertyValue("lazyInit", false);
    beanDefinition.getPropertyValues().addPropertyValue("namedQueries", new RuntimeBeanReference("jdbc.named-queries#0"));
    beanDefinition.getPropertyValues().addPropertyValue("repositoryFragments", new RuntimeBeanReference("jdbc.SpringDataPaymentJdbcRepository.fragments#0"));
    beanDefinition.getPropertyValues().addPropertyValue("enableDefaultTransactions", true);
    beanDefinition.getPropertyValues().addPropertyValue("transactionManager", "transactionManager");
    beanDefinition.getPropertyValues().addPropertyValue("jdbcAggregateOperations", new RuntimeBeanReference("org.springframework.data.jdbc.core.JdbcAggregateOperations", JdbcAggregateOperations.class));
    beanDefinition.getPropertyValues().addPropertyValue("repositoryFragmentsFunction", new RepositoryFactoryBeanSupport.RepositoryFragmentsFunction() {
      public RepositoryComposition.RepositoryFragments getRepositoryFragments(
          BeanFactory beanFactory, RepositoryFactoryBeanSupport.FragmentCreationContext context) {
        JdbcAggregateOperations operations = beanFactory.getBean(JdbcAggregateOperations.class);
        BeanFactoryAwareRowMapperFactory rowMapperFactory = new BeanFactoryAwareRowMapperFactory(beanFactory, operations, beanFactory.getBeanProvider(QueryMappingConfiguration.class).getIfUnique(() -> QueryMappingConfiguration.EMPTY));
        return RepositoryComposition.RepositoryFragments.just(new com.axiz.poc.payments.adapter.out.persistence.SpringDataPaymentJdbcRepositoryImpl__AotRepository(operations, rowMapperFactory, context));
      }
    });
    beanDefinition.setInstanceSupplier(getSpringDataPaymentJdbcRepositoryInstanceSupplier());
    return beanDefinition;
  }
}
