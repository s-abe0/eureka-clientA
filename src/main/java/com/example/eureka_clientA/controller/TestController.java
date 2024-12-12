package com.example.eureka_clientA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.eureka_clientA.client.ClientBClient;

@Controller
@RequestMapping(value = "/api")
public class TestController {
	
	@Autowired
	private ClientBClient clientB;
	
	@GetMapping("/test")
	public ResponseEntity<String> getTest() {
		return ResponseEntity.status(HttpStatus.OK).body(clientB.getHelloWorld().getBody());
	}
}
