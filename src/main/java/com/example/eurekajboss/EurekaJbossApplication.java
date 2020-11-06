package com.example.eurekajboss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaJbossApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaJbossApplication.class, args);
	}

}
