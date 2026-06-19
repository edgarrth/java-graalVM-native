package com.axiz.poc.payments.application.service;

import com.axiz.poc.payments.application.port.out.MerchantRepository;
import com.axiz.poc.payments.application.port.out.PaymentEventPublisher;
import com.axiz.poc.payments.application.port.out.PaymentMethodRepository;
import com.axiz.poc.payments.application.port.out.PaymentRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AuthorizePaymentService}.
 */
@Generated
public class AuthorizePaymentService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'authorizePaymentService'.
   */
  private static BeanInstanceSupplier<AuthorizePaymentService> getAuthorizePaymentServiceInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<AuthorizePaymentService>forConstructor(PaymentRepository.class, MerchantRepository.class, PaymentMethodRepository.class, PaymentEventPublisher.class)
            .withGenerator((registeredBean, args) -> new AuthorizePaymentService(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'authorizePaymentService'.
   */
  public static BeanDefinition getAuthorizePaymentServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuthorizePaymentService.class);
    beanDefinition.setInstanceSupplier(getAuthorizePaymentServiceInstanceSupplier());
    return beanDefinition;
  }
}
