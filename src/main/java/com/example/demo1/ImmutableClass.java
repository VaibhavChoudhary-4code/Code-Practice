package com.example.demo1;

public final class ImmutableClass {

	private String name;
	private final int age;
	
	
	public ImmutableClass(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}
