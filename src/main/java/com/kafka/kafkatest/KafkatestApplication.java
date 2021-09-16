package com.kafka.kafkatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class KafkatestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkatestApplication.class, args);
	}

}
