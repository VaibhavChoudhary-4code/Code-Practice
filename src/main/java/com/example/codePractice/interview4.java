package com.example.codePractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.attribute.HashAttributeSet;

public class interview4 {

	public static void main(String[] args) {
		
		// First Non Repeting Characters in string 
		
		String s = "Vaibhav";
		//Output : b
		
		Map<Character,Integer> obj = new HashMap<>();
		
		char[] arr = s.toCharArray();
		
		for (char c : arr) {
			obj.put(c, obj.getOrDefault(c, 0)+1);
		}
		
		obj.entrySet().stream().filter(i -> i.getValue() == 1).map(Map.Entry::getKey).limit(1).forEach(System.out::println);
		
				
		

	}

}
