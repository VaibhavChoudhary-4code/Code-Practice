package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Synchronized;

public class JavaNormalCodePractice10 {

	public static void main(String[] args) {
		
		// Reverse Words in a Sentence (Given a string, write a function to reverse the words in the string while maintaining the order of the words.)
//		String sentence = "Hello world, how are you?";
//		String reverse = Arrays.stream(sentence.split("\\s+")).map(JavaNormalCodePractice10::reverseWords).collect(Collectors.joining(" "));
//		System.out.println(" Reverse : "+reverse);
		
		// Write simple Java code for, whether given strings have the character "i", using stream API only.
//		System.out.println(reverse.chars().anyMatch(c -> c == 'H'));
		
		String[] strings = {"apple", "banana", "apple", "cherry", "banana", "apple"};
	    // Write code for finding the maximum occurrence of a string. 
//		Arrays.stream(strings).collect(Collectors.groupingBy(s -> s, Collectors.counting())).forEach((s,count) -> {
//			System.out.println(" String : "+s+" Count : "+count);
//		});
		
		// String duplication through hashmap?
//		Map<String,Long> obj = new HashMap<>();
//		
//		long count = 0;
//		for (int i = 0; i < strings.length; i++) {
//			String string = strings[i];
//			if(obj.containsKey(string)) {
//				obj.put(string, obj.get(string)+1);
//			} else {
//				count = 1;
//				obj.put(string, count);
//			}
//		}
//		obj.entrySet().forEach((s) -> {
//			if(s.getValue() > 1) {
//				System.out.println(" Duplicated String "+s.getKey()+" Count "+s.getValue());
//			}
//		});
		
//		Map<String, Long> obj = new HashMap<>();
//		for (String string : strings) {
//			obj.put(string, obj.getOrDefault(string, 0L)+1);
//		}
//		
//		obj.entrySet().forEach((s) -> {
//			if(s.getValue() > 1) {
//				System.out.println(" Duplicated String "+s.getKey()+" Count "+s.getValue());
//			}
//		});
		
		
		// print list whose column value is greater than 20 in java8?
		
		Set<String> list1 = new HashSet<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");

        Set<String> list2 = new HashSet<>();
        list2.add("banana");
        list2.add("cherry");
        list2.add("grape");
        
		// Given two sets of lists of words, find similar words in both lists?
//		List<String> list3 = list1.stream().filter(list2::contains).collect(Collectors.toList());
//        System.out.println(" similar words "+list3);
//		
		// HashMap duplication of Key ?
       
        // Make only the Key of Hashmap as Caps? 
//        Map<String, Integer> originalMap = new HashMap<>();
//        originalMap.put("apple", 5);
//        originalMap.put("banana", 8);
//        originalMap.put("cherry", 12);
//        
//        Map<String, Integer> uppercaseKeyMap = new HashMap<>();
//        for (Map.Entry<String, Integer> string : originalMap.entrySet()) {
//        	uppercaseKeyMap.put(string.getKey().toUpperCase(), string.getValue());
//		}
//        System.out.println(" Map with UpperCase Key "+uppercaseKeyMap);
      
        // count the characters in a string?
        String s = "Vaibhav";
        
//        s.toUpperCase().chars().mapToObj((s2) -> (char) s2).collect(Collectors.groupingBy(s2 -> s2, Collectors.counting())).forEach((c,count) -> {
//        	System.out.println(" Character "+c+" Count "+count);
//        });
        
//        char[] c = s.toLowerCase().toCharArray();
//        Map<Character,Long> obj = new HashMap<>();
//        for (int i = 0; i < c.length; i++) {
//        	char d = c[i];
//        	obj.put(d, obj.getOrDefault(d , 0L)+1);
//		}
//        System.out.println(" Char Count "+obj);
        
        // equals method (different codes) 
        
        // palindrome program in Java through for loop? (code)
//        char[] c = s.toCharArray();
//        String p = "";
//        for (int i = s.length() - 1; i >= 0 ; i--) {
//        	char d = c[i];
//        	p = p + String.valueOf(d);
//		}
//        if( p.equals(s) ) {
//        	System.out.println(" It's Palindrome ");	
//        } else {
//        	System.out.println(" It's not Palindrome ");
//        }
        
//        String p = new StringBuilder(s).reverse().toString();
//        if( p.equals(s) ) {
//        	System.out.println(" It's Palindrome ");	
//        } else {
//        	System.out.println(" It's not Palindrome ");
//        }
        
        Integer[] array = {1, 2, 3, 2, 4, 5, 4, 6, 7, 8, 5};
        
        // duplicate values in the array in java code (code)?
//        Map<Integer,Integer> obj = new HashMap<>();
//        for (int j : array) {
//        	obj.put(j, obj.getOrDefault(j, 0)+1);
//		}
//        System.out.println(" Array "+obj);
        
        
        // equals and hashcode contract? 
        
        // how to sort an array and get the second highest number (code).
//        Arrays.sort(array);
//        if(array.length >= 2 ) {
//        	System.out.println(" Second Heighest Value "+array[array.length - 2]);
//        }
        
        // if we have a map having string and integer in it and we want to have all the strings which is having the same values(code).
        
        List<Integer> obj = Arrays.asList(array);
        // In list how will you achieve the second largest using stream API?
//        System.out.println(obj.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get());
        
        // average salary of department using stream? (code)
        
        // how to convert list to map so how to do that? (code)
        
        // How can you remove the duplicate elements from array without using any inbuilt method? & please share the code complexity? (code)
        
        // Can you create a thread using Java8? (code)
        
//        Object lock = new Object();
//        
//        Thread thread = new Thread(() -> {
//        	for (int i = 0; i < 5; i++) {
//				System.out.println(" Thread is Running "+i);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//        });
//        
//        Thread thread1 = new Thread(() -> {
//        	for (int i = 0; i < 5; i++) {
//				System.out.println(" Thread1 is Running "+i);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//        });
//        
//        thread.start();
//        try {
//			thread.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        thread1.start();
        
        
        // Can you write one immutable class?
        
        // Write program to find second largest number in array don’t use any inbuild method like sorting? (code)
        
        // Implement reusable predicate.
        
//        Predicate isEven = ReusablePredicate.isEven();
//        Predicate isPositive = ReusablePredicate.isPositive();
//        Predicate isGreaterThen = ReusablePredicate.isGreaterThen(5);
//        
//        System.out.println(" Is Even "+isEven.test(4));
//        System.out.println(" Is Positive "+isPositive.test(-4));
//        System.out.println(" Is Greater Then "+isGreaterThen.test(8));
    
        // First Non-repeting character in string? (code)
//        String str = "Vaibhav";
//        Map<Character,Long> charFrequency = new HashMap<>();
//        str.chars().mapToObj(i -> (char)i).forEach(i -> charFrequency.put(i, charFrequency.getOrDefault(i, 0L)+1));
//        char s1 = charFrequency.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().map(Map.Entry::getKey).orElse('\0');
//        System.out.println(" Character "+s1);
        
        
        
	}
	
	
	public static String reverseWords(String word) {
		return new StringBuilder(word).reverse().toString();
	}
	
}

class ReusablePredicate{
	
	public static Predicate<Integer> isEven(){
		return number -> number % 2 == 0;
	}
	
	public static Predicate<Integer> isPositive(){
		return number -> number > 0;
	}
	
	public static Predicate<Integer> isGreaterThen(int thresold){
		return number -> number > thresold;
	}
}

