package com.example.demo1;

class Singleton {

	private static Singleton Instance = null;
	
	public String s;
	
	private Singleton() {
		s = " Hello There ";
	}
	
	public static synchronized Singleton getInstance() {
		if(Instance == null)
			Instance = new Singleton();
		return Instance;
	}	
		
}

public class SingletonPractice{
	
	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		
		Singleton y = Singleton.getInstance();
		
		Singleton z = Singleton.getInstance();
		
		System.out.println(" Hashcode of X "+x.hashCode());
		System.out.println(" Hashcode of Y "+y.hashCode());
		System.out.println(" Hashcode of Z "+z.hashCode());
				
	}
	
}
