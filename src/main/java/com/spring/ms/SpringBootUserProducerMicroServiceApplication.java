package com.spring.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootUserProducerMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUserProducerMicroServiceApplication.class, args);
	}
}
