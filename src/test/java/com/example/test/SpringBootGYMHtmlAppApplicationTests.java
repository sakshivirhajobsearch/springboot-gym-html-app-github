package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// Make sure this import matches the actual package of your main application class
import com.example.springboothtmlapp.SpringBootGYMHtmlAppApplication;

@SpringBootTest(classes = SpringBootGYMHtmlAppApplication.class)
public class SpringBootGYMHtmlAppApplicationTests {

	@Test
	void contextLoads() {
		// This test ensures the Spring context loads without issues.
	}
}
