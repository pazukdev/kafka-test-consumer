package com.pazukdev.kafkatestconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaTestConsumerApp {

    private static final Logger LOG = LoggerFactory.getLogger("KafkaTestConsumerApp");

    public static void main(String[] args) {
        SpringApplication.run(KafkaTestConsumerApp.class, args);
    }

    @KafkaListener(topics = "test-topic", group = "test-group")
    public void listen(String message) {
        LOG.info("Received message in JCG group: {}", message);
    }

}
