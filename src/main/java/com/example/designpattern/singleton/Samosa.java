package com.example.designpattern.singleton;

import java.io.Serializable;

import javax.management.RuntimeErrorException;

import org.apache.logging.log4j.CloseableThreadContext.Instance;

public class Samosa implements Serializable , Cloneable{

//	INSTANCE;
	
	private static Samosa samosa;
	
	// Constructor
	private Samosa(){
		if(samosa != null) {
			throw new RuntimeException(" You are trying to break singleton pattern! ");
		}
	}
	
	// lazy way of creating
	public static Samosa getSamosa() {
		if(samosa == null) {
			synchronized (Samosa.class) {
				samosa = new Samosa();	
			}
		}
		return samosa;
	}
	
	public Object readResolve() {
		return samosa;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return samosa;
	}
	
//	public void test() {
//		System.out.println("test method");
//	}
	
	
	
}

/*
* How to break Singleton Design Pattern? 
* 
* 1. Reflection API
* 2. Using eNum
* 3. Deserialization (for this use readresolve method)
* 4. Object Cloning
* 
*/