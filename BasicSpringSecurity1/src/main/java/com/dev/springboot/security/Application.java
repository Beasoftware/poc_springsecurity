package com.dev.springboot.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.dev.springboot.security")

public class Application {
	@SuppressWarnings({ "rawtypes", "unused" })
	private static Class applicationClass = Application.class;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
