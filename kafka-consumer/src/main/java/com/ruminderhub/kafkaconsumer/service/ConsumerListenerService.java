package com.ruminderhub.kafkaconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ConsumerListenerService {
    private final Logger log = LoggerFactory.getLogger(ConsumerListenerService.class);

    @KafkaListener(topics="users", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Message received is " + message);
    }

    @KafkaListener(topics = "users", groupId = "config_listener")
    public void cosumerMessageUsingConfigConsumer(String message) {
        log.info("Message recevied by configConsumer is {}", message);
    }
}