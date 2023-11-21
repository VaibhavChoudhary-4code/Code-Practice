package com.example.spring.scope;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
class SingletonBean {
    private final String message = "Singleton Bean";

    public String getMessage() {
        return message;
    }
}

@Component
@Scope("prototype")
class PrototypeBean {
    private final String message = "Prototype Bean";

    public String getMessage() {
        return message;
    }
}

@Component
@Scope("request")
class RequestScopedBean {
    private final String message = "Request Scoped Bean";

    public String getMessage() {
        return message;
    }
}

@SpringBootApplication
public class BeanScopeDemoApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext  context = SpringApplication.run(BeanScopeDemoApplication.class, args);
		
		SingletonBean singletonBean = context.getBean(SingletonBean.class);
		PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
		RequestScopedBean requestScopedBean = context.getBean(RequestScopedBean.class);
		
		System.out.println("Singleton Bean Message: " + singletonBean.getMessage());
	    System.out.println("Prototype Bean Message: " + prototypeBean.getMessage());
	    System.out.println("Request Scoped Bean Message: " + requestScopedBean.getMessage());

		context.close();		
	}

}
