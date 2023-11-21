package com.example.spring.scope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryVsApplicationContextExample {

    public static void main(String[] args) {
        // Creating a BeanFactory
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        
        // Creating an ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        // Retrieving a bean from BeanFactory
        HelloWorldBean beanFromBeanFactory = beanFactory.getBean("helloWorldBean", HelloWorldBean.class);
        beanFromBeanFactory.sayHello();

        // Retrieving a bean from ApplicationContext
        HelloWorldBean beanFromApplicationContext = applicationContext.getBean("helloWorldBean", HelloWorldBean.class);
        beanFromApplicationContext.sayHello();
    }
}
