package com.example.designpattern.singleton;

public class Jalebi {

	// eager way of creating 
	private static Jalebi jalebi = new Jalebi();
	
	public static Jalebi getJalebi() {
		return jalebi;
	}
	
}
