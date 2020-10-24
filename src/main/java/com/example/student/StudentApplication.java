package com.example.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		 ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		SpringApplication.run(StudentApplication.class, args);
	}

}
