package com.example.spring.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MyBean myBean = context.getBean(MyBean.class);
		
//		System.out.println(" HashCode 1 "+myBean.hashCode());
		
		myBean.performTask();
		
		
//		MyBean myBean1 = context.getBean(MyBean.class);
//		
//		System.out.println(" HashCode 2 "+myBean1.hashCode());
		
		
		context.close();
	}

}
