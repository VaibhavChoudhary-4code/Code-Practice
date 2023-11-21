package com.example.demo;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaNormalCodePractice2 {

	public static void main(String[] args) {
		
		// How to reverse a string in Java (Palindrome).
		
//		String s = "Vaibhav";
		
//		StringBuilder sb = new StringBuilder(s);
//		System.out.println(sb.reverse());
		
//		char[] ch = s.toCharArray();
//		
//		String v = "";
//		for(int i=ch.length -1;i>=0;i--) {
//			v = v+s.charAt(i);
//		}
//		System.out.println("Reversed "+v);
		
		// How to swap two numbers without using a third variable.
		
//		int i = 2;
//		int j = 3;
//		
//		i = i+j;
//		j = i-j;
//		i = i-j;
//		
//		System.out.println(" i = "+i+" & j = "+j);
		
		// To Check if a vowel is present in a string or not.
		
//		String s = "Vaibhav".toLowerCase();
//		
//		if(s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u")) {
//			System.out.println("String contains vowels");
//		}
		
		// Write a Java Program to find whether a number is prime or not.
		
//		int i = 29;
//		
//		Boolean flag = true;
//		if(i != 0 || i != 1) {
//			for(int j = 2; j <= Math.sqrt(i); j++) {
//				if( i % j == 0) {
//					flag = false;
//				} 
//			}
//		}	
//		if(flag.equals(true)) {
//			System.out.println("It's a prime number");
//		} else {
//			System.out.println("It's not a prime number");
//		}
		
		// Fibonacci Series Using Java.
		
//		int i = 0;
//		int j = 1;
//		
//		int count = 10;
//		
//		System.out.print(i+" "+j+" ");
//		for(int k = 2; k<count; k++) {
//			int l = i + j; 
//			System.out.print(l+" ");
//			
//			i = j;
//			j = l;
//		}
		
		// Find the factorial of the number.
		
//		int number = 5;
//		
//		int fact = 1;
//		for(int i = 1; i <= number ;i++) {
//			fact *= i;
//		}
//		
//		System.out.print("Factorial of "+number +" is "+fact);
		
		// Write a Java Program to find the duplicate characters in a string.
		
//		String s = "Vaibhav";
//		
//		Map<Character, Long> charSequenceCount = s.toLowerCase().chars().mapToObj(i -> (char) i)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		
//		charSequenceCount.forEach((ch, count) -> {
//			if(count > 1) {
//				System.out.println(ch+" "+count);
//			}
//		});
		
		// Write a Java Program to find the second-highest number in an array
		
//		int arr[] = {42,242,4,131,353,1,1232};
//		
//		long secondHighest = Arrays.stream(arr).distinct().boxed().sorted((a,b) -> b-a).skip(1).findFirst().orElse(Integer.MIN_VALUE);
//		
//		System.out.println(" secondHighest "+secondHighest);
		
		
		// Java Program to Check if two strings are anagrams.
		
//		String s = "Raju";
//		String t = "Jura";
//		
//		s = s.replace("\\s", "").toLowerCase();
//		t = t.replace("\\s", "").toLowerCase();
//		
//		char ch1[] = s.toCharArray();
//		char ch2[] = t.toCharArray();
//		
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		
//		Boolean flag = Arrays.equals(ch1, ch2);
//		if(flag) {
//			System.out.println("Is Anagram");
//		} else {
//			System.out.println("Is Not Anagram");
//		}
		
		// Count the occurrence of characters in a given string using Java.
		
//		String s = "Vaibhav";
//		
//		Map<Character, Long> occuranceOfCharacter = s.toLowerCase().chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		
//		occuranceOfCharacter.forEach((ch,count) -> {
//			System.out.println(ch+" = "+count);
//		});
		
		
		// Count the occurrence of words in a given string using Java 8.
		
//		String s = "Vaibhav is good guy , but he is great guy too";
//		
//		Map<String, Long> occuranceOfWord = Arrays.stream(s.split("\\s"))
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		
//		occuranceOfWord.forEach((words,count) -> {
//			System.out.println(words+" = "+count);
//		});
		
		
		// Find the first non-repeating character of the given String.
		
//		String s = "Vaibhav";
//
//        Map<Character, Long> charFrequencyMap = s.toLowerCase()
//                .chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        for (char c : s.toLowerCase().toCharArray()) { // Convert to lowercase for iteration
//            if (charFrequencyMap.get(c) == 1) {
//                System.out.print(" " + c);
//                break;
//            }
//        }
		
		// how to remove special characters from a string.
		
//		  String input = "Hello, @World! #123";
//        String result = input.replaceAll("[^a-zA-Z0-9]", ""); // Replace non-alphanumeric characters
//        System.out.println("Original: " + input);
//        System.out.println("After Removing Special Characters: " + result);
        
		
		// Write a Java Program to check the Armstrong numbers.
		
		int number = 153;
		
		int originalNumber = number;
		int sum = 0;
		int numOfDigits = String.valueOf(number).length();
		
		while(number > 0) {
			int digit = number % 10;
			System.out.println(" digit "+digit);
			sum += Math.pow(digit, numOfDigits);
			System.out.println(" sum "+sum);
			number /= 10;
			System.out.println(" number "+number);
		}
		
		System.out.println(sum +" "+originalNumber);
		
		
		
	}

}
