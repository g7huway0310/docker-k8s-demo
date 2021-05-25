package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@GetMapping("/test-docker")
	public String getDate() {
		return "This is a DockerDemo!";
		
	}

}
