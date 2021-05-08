package com.ruminderhub.kafka.service;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.config.TopicBuilder;

public class TopicService {

    public NewTopic createTopic(String topicName, Integer replicas, Integer partitions) {
        return TopicBuilder.name(topicName).replicas(replicas).partitions(partitions).build();
    }
}
