package com.wiley.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaServerShareManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerShareManagementApplication.class, args);
	}

}
