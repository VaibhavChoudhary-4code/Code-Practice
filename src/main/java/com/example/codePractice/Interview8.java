package com.example.codePractice;

import java.util.ArrayList;
import java.util.List;

public class Interview8 {

	public static void main(String[] args) {
		
		
		//1.Write Java Application to create ArrayList add 3-4 Cities Name and print using Lambda Expression                                                        

		List<String> objList = new ArrayList<>();
		objList.add("Mumbai");
		objList.add("Delhi");
		objList.add("Nagpur");
		
		objList.stream().forEach(System.out::println);
		
		

		//2.Write Java Program to reverse String without using Inbuilt reverse
		
		String s = "vaibhav";
		
		String g = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			g = g + s.charAt(i);
		}
		
		System.out.println(" Reverse String "+g);
		
		
		
		
	}

}
