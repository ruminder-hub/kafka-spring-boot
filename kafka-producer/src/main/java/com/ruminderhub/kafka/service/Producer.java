package com.ruminderhub.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaProducerException;
import org.springframework.kafka.core.KafkaSendCallback;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

@Service
public class Producer {
    private static final Logger log = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "users";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Sending message " + message);
        ListenableFuture<SendResult<String, String>> listenableFuture = kafkaTemplate.send(TOPIC, message);
        listenableFuture.addCallback(new KafkaSendCallback<String, String>() {

            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.info("Rumi message sent successfully " + result.getProducerRecord().toString());
            }

            @Override
            public void onFailure(KafkaProducerException e) {
                log.info("Failed to send message " + e.getFailedProducerRecord().toString());
            }
        });
    }
}