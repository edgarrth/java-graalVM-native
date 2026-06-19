package com.axiz.poc.payments.adapter.out.messaging;

import com.axiz.poc.payments.application.port.out.PaymentEventPublisher;
import com.axiz.poc.payments.domain.event.PaymentAuthorizedEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class KafkaPaymentEventPublisher implements PaymentEventPublisher {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;
    private final String topic;
    private static final Logger log = LoggerFactory.getLogger(KafkaPaymentEventPublisher.class);

    public KafkaPaymentEventPublisher(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper, @Value("${payment.events.topic}") String topic) {
        this.kafkaTemplate = kafkaTemplate; this.objectMapper = objectMapper; this.topic = topic;
    }
    @Override
    public void publish(PaymentAuthorizedEvent event) {
        try {
            String payload = objectMapper.writeValueAsString(event);

            kafkaTemplate
                    .send(topic, event.paymentId().toString(), payload)
                    .get();

        } catch (Exception ex) {
            log.error("Error publishing payment event to Kafka. topic={}, event={}", topic, event, ex);
            throw new RuntimeException("payment event could not be published", ex);
        }
    }
}
