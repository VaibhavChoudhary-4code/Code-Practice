package com.example.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;

public class MyBean {

	@PostConstruct
	public void init() {
		System.out.println("Bean is being initialized.");
	} 
	
	public void performTask() {
		System.out.println("Bean is performing a task.");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Bean is being destroyed.");
	}
	
}
