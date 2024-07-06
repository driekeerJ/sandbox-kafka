package org.example.sandboxkafka.api;

import org.example.sandboxkafka.domain.Order;
import org.example.sandboxkafka.producer.OrderProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/orders")
@Slf4j
@RequiredArgsConstructor
public class OrderController {

    private final OrderProducer orderProducer;

    @PostMapping
    public void createOrder(@RequestBody Order order) {
        log.info("Order received: {}", order);
        orderProducer.sendMessage(order);
    }

}
