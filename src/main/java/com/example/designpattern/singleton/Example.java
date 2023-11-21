package com.example.designpattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Example {

	public static void main(String[] args) throws Exception {
		
//		Samosa samosa = Samosa.getSamosa();
//		System.out.println(samosa.hashCode());
//		
//		Samosa samosa1 = Samosa.getSamosa();
//		System.out.println(samosa1.hashCode());
		
//		System.out.println(Jalebi.getJalebi().hashCode());
//		System.out.println(Jalebi.getJalebi().hashCode());
		

//		Samosa s1 = Samosa.INSTANCE;
//		System.out.println(s1.hashCode());
//		s1.test();
		
		// Reflection API
//		Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		Samosa samosa2 = constructor.newInstance();
//		System.out.println(samosa2.hashCode());
		
		
		Samosa samosa = Samosa.getSamosa();
		System.out.println(samosa.hashCode());
//		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//		os.writeObject(samosa);
//		
//		System.out.println(" Serialization Done ");
//		
//		ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("abc.ob"));
//		Samosa samosa2 = (Samosa) os1.readObject();
//		System.out.println(samosa2.hashCode());
		
	 	Samosa s2 = (Samosa) samosa.clone();
		System.out.println(s2.hashCode());
		
	 	
	}

}
