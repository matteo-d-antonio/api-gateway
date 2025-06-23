package com.example.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.config.EnableGateway;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableGateway  // Abilita l'API Gateway
@ComponentScan(basePackages = "com.example.apigateway")  // Configura la scansione dei componenti
public class ApiGatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
}
