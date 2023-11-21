package com.example.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean(initMethod = "init" , destroyMethod = "cleanUp")
	public MyBean myBean() {
		return new MyBean();
	}
	
}
