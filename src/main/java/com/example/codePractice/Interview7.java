package com.example.codePractice;

import java.util.Arrays;

public class Interview7 {

	public static void main(String[] args) {
	
		// aba = aab (anagram)

		String s1 = "aba";
		String s2 = "aab";

		char[] s3 = s1.toCharArray();	
		char[] s4 = s2.toCharArray(); 	
	
		Arrays.sort(s3);
		Arrays.sort(s4);
		
		Boolean flag = Arrays.equals(s3, s4);
		
		if(flag) {
			System.out.println(" IT's anagram ");
		} else {
			System.out.println(" IT's not anagram ");
		}
		
		for (int i = 0; i < s3.length; i++) {
			for (int j = 0; j < s4.length; j++) {
				
			}
		}
		
		// a  a  b  
		// a
		// a  b  a
		
		// count = a = 2 count b = 1
		// if 
		
		
		
		
		
	}

}
