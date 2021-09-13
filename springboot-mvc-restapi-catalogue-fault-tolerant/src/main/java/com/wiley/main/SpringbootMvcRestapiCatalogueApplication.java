package com.wiley.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.wiley")
public class SpringbootMvcRestapiCatalogueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcRestapiCatalogueApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
