package com.example.eureka_clientA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EurekaClientAApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientAApplication.class, args);
	}

}
