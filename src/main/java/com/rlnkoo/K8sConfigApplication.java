package com.rlnkoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class K8sConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sConfigApplication.class, args);
	}

	@GetMapping("/message")
	public String displayMessage() {
		return "Successfully deployed application to kubernetes!";
	}
}
