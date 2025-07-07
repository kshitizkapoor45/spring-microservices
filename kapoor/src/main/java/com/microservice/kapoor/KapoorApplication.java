package com.microservice.kapoor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KapoorApplication {

	public static void main(String[] args) {
		SpringApplication.run(KapoorApplication.class, args);
	}

}
