package com.mcx.bikedotregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BikedotRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikedotRegisterApplication.class, args);
	}

}
