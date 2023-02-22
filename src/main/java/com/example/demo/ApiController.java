package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class ApiController {
	@GetMapping("/")
	public String getName() {
		return "Welcom to Spring boot";
	}

}
