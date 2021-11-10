package com.mcx.bikedotoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BikedotOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikedotOauthApplication.class, args);
	}

}
