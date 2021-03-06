package com.mcx.bikedotgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class BikedotGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikedotGatewayApplication.class, args);
	}

}
