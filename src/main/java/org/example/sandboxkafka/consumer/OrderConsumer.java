package org.example.sandboxkafka.consumer;

import org.example.sandboxkafka.domain.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderConsumer {

    @KafkaListener(topics = "orders", groupId = "order-consumers")
    public void consume(Order order) {
        log.info("Order RECEIVED: {}", order);
    }
}
