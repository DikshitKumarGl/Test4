package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Test4DockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test4DockerApplication.class, args);
	}
	@GetMapping("/doc")
	public String getdoc() {
		return "Testing Docker by me";
	}
}
