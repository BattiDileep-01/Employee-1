package com.Empoyee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Empoyee1Application {

	public static void main(String[] args) {
		SpringApplication.run(Empoyee1Application.class, args);
	}

}
