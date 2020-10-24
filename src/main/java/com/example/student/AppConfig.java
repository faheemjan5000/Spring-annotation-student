package com.example.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//this class giving us all the configuration as we did in xml file, so we use the following annotation 
@Configuration
@ComponentScan(basePackages="com.example.student,controllers,dao,entity,service")
public class AppConfig {

	
	
}
