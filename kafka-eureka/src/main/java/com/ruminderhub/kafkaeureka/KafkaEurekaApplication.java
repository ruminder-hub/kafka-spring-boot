package com.ruminderhub.kafkaeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KafkaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaEurekaApplication.class, args);
	}

}
