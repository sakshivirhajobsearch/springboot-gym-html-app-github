package com.example.springboothtmlapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootGYMHtmlAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootGYMHtmlAppApplication.class, args);
	}
}
