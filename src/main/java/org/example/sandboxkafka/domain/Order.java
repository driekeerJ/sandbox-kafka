package org.example.sandboxkafka.domain;

import java.util.UUID;

public record Order(UUID id, String product, int quantity, double price) {
}
