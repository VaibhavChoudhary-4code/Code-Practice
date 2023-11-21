package com.example.demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaNormalCodePractice1 {

	public static void main(String[] args) {
		
		//How to reverse a string in Java (Palindrome).
//		String s = "Hello";
//		
//		StringBuilder s1 = new StringBuilder(s);
//		System.out.println(s1.reverse());
//		
//		char ch[];
//		String reverse = "";
//		for(int i = s.length() - 1;i >= 0; i--) {
//			reverse = reverse + s.charAt(i);
//		}
//		System.out.println(reverse);
		
		//How to swap two numbers without using a third variable.
		
//		int i = 1;
//		int j = 2;
//		
//		i = i+j;
//		j = i -j;
//		i = i- j;
//		System.out.println(i+" "+j);
		
		// To Check if a vowel is present in a string or not.
		// Write a Java Program to find whether a number is prime or not.
//		int number = 29;
//		boolean isPrime = true;
//		
//		for(int i = 2; i <= Math.sqrt(number); i++) {
//			if(number % i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		
//		if(isPrime) {
//			System.out.println("It's a Prime Number");
//		} else {
//			System.out.println("It's not a Prime Number");
//		}
		
		
		//Fibonacci Series Using Java.
//		int count = 10;
//		
//		int firstTerm = 0;
//		int secondTerm = 1;
//				
//		System.out.print(firstTerm+"-"+secondTerm+" ");
//		for(int i = 2; i <= count; i++) {
//			int nextTerm = firstTerm + secondTerm;
//			System.out.print(nextTerm+" ");
//			
//			firstTerm = secondTerm;
//			secondTerm = nextTerm;
//		}
		
		
		// Find the factorial of the number.
		
//		int number = 5;
//		
//		if(number <= 0) {
//			System.out.println("Factorial is not possible");
//		} 
//		
//		long factorial = 1;
//		for(int i = 1; i<= number; i++) {
//			factorial *= i;
//		}
//		System.out.println("Factorial is "+factorial);

		
		// Write a Java Program to find the duplicate characters in a string.
		
//		String input = "Vaibhav";
//		
//		Map<Character, Long> charFrequencyMap = input.toLowerCase().chars()
//	            .mapToObj(c -> (char) c)
//	            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//		charFrequencyMap.forEach((character, count) -> {
//            if (count > 1) {
//                System.out.println(character + " (count: " + count + ")");
//            }
//        });
		
		
		// Write a Java Program to find the second-highest number in an array.
		
//		int[] numbers = {10,6,42,22,56,14};
//		
//		Integer secondHighest = Arrays.stream(numbers).distinct().boxed().sorted((a,b) -> b-a).skip(1).findFirst().orElse(Integer.MIN_VALUE);
//		
//		System.out.println(" secondHighest "+secondHighest);
		
		
		// Java Program to Check if two strings are anagrams
		
		
		
		
		// Fail Fast Operarators 
		
//		List<String> list = new ArrayList<>();
//		list.add("Apple");
//		list.add("Banana");
//		list.add("Cherry");
//
//		Iterator<String> iterator = list.iterator();
//
//		while (iterator.hasNext()) {
//		    String fruit = iterator.next();
//		    System.out.println(fruit);
//		    list.remove(iterator.next()); // Concurrent modification
//		}
		
		
	}
}
	