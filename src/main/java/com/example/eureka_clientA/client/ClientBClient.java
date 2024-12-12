package com.example.eureka_clientA.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("clientb")
public interface ClientBClient {
	
	@GetMapping("/api/hello-world")
	public ResponseEntity<String> getHelloWorld();
}
