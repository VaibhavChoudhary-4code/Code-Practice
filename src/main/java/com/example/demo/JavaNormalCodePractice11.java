package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.ToString;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;



public class JavaNormalCodePractice11 {

	public static void main(String[] args) {

		List<Integer> list1 = Stream.of(10, 20, 30, 40, 50).collect(Collectors.toList());
		List<Integer> list2 = Stream.of(5, 10, 25, 35, 45).collect(Collectors.toList());
		
		// Write a program to find the common elements between two ArrayLists.
//		list1.stream().filter(list2::contains).forEach(System.out::println);
		
		// Write a program to reverse an ArrayList.
//		list1.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		// Write a program to remove all the elements from an ArrayList that are divisible by 3.
//		List<Integer> obj = list2.stream().filter(i -> i%3 != 0).collect(Collectors.toList());
//		obj.forEach(System.out::println);
		
		// Write a program to find the intersection of two ArrayLists.
//		list1.stream().filter(list2::contains).forEach(System.out::println);
		
		// Write a program to find the union of two ArrayLists.
//		List<Integer> obj = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
//		obj.forEach(System.out::println);
		
		// Write a program to find the maximum and minimum elements in an ArrayList.
//		int i = list1.stream().max((a,b) -> a-b).get();
//		System.out.println(" Maximum Element "+i);
		
//		int i = list1.stream().max((a,b) -> b-a).get();
//		System.out.println(" Minimum Element "+i);
		
		// Write a program to find the nth smallest element in an ArrayList.
//		int i = list1.stream().sorted().skip(2-1).findFirst().orElseThrow(() -> new RuntimeException(" Element No Found "));
//		System.out.println(" Nth Smallest Element "+i);
		
		// Write a program to convert an ArrayList to an array.
//		Integer[] arr = list1.toArray(new Integer[list1.size()]);
		
		// Write a program to create a new ArrayList that contains only the even elements from the original ArrayList.
		
		// Write a program to create a new ArrayList that contains only the odd elements from the original ArrayList.
		
		// Write a Java program to remove all duplicates from an ArrayList.
		
		List<Integer> linkedList = new LinkedList<>(Stream.of(10, 20, 30, 40, 50).collect(Collectors.toList()));
		// Write a Java program to remove all elements from a LinkedList that are greater than a given value.
//		linkedList.removeIf(i -> i> 30);
//		System.out.println(" LinkedList "+linkedList);
		
		Set<String> stringSet = new HashSet<>();
		stringSet.add("grape");
		stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("orange");
        stringSet.add("kiwi");
		// Write a Java program to sort a HashSet of Strings in alphabetical order.
//      System.out.println(" alphabetical order before "+stringSet);
//		TreeSet<String> tsObj = new TreeSet<>(stringSet);
//		System.out.println(" alphabetical order after "+tsObj);
		
        // Write a Java program to find the difference between two LinkedLists.
        
        // Write a Java program to find the maximum and minimum elements in a TreeSet.
        
        String sentence = "Hello world! This is a sample sentence.";
        // Reverse Words in a Sentence (Given a string, write a function to reverse the words in the string while maintaining the order of the words.)
//        String s = Arrays.stream(sentence.split(" ")).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
//        System.out.println(" Reverse Of String "+s);
		
		// Write a program that creates two threads, one printing odd numbers and the other printing even numbers, while ensuring correct synchronization.
//        Object lock = new Object();
//        Thread thread1 = new Thread(() -> {
//        	synchronized (lock) {
//	        	for (int i = 0; i < 10; i++) {
//	        		if( i % 2 == 0 && i != 0) {
//	        			System.out.println(" Thread1 Even Number "+i);
//	        			
//	        			try {
//							Thread.sleep(1000);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//	        		}
//				}
//        	}
//        });
//        
//        Thread thread2 = new Thread(() -> {
//        	synchronized (lock) {
//	        	for (int i = 0; i < 10; i++) {
//	        		if( i % 2 != 0 && i != 0) {
//	        			System.out.println(" Thread2 Odd Number "+i);
//	        			
//	        			try {
//							Thread.sleep(1000);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//	        		}
//				}
//        	}
//        });
//        
//        thread1.start();
//        thread2.start();
        
        // Write a program to reverse a singly linked list.
        
        
        // Write a function to find the maximum sum of a contiguous subarray in an array.
//        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        
//        int maxEndingHere = nums[0];
//        int maxSoFar = nums[0];
//        
//        for (int i = 0; i < nums.length; i++) {
//        	maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
//			maxSoFar = Math.max(maxSoFar, maxEndingHere);
//		}
//        
//        System.out.println(" maximum sum of a contiguous subarray "+maxSoFar);
        
        // Given an array containing numbers from 1 to n with one number missing, find the missing number.
        
        // if we have a map having string and integer in it and we want to have all the strings which is having the same values(code).
//        Map<String, Integer> originalMap = new HashMap<>();
//        originalMap.put("A", 1);
//        originalMap.put("B", 2);
//        originalMap.put("C", 1);
//        originalMap.put("D", 3);
//        originalMap.put("E", 2);
//
//		Map<Integer, List<String>> objMap = originalMap.entrySet().stream().collect(
//				Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList()))).entrySet().stream().filter(i-> i.getValue().size() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        System.out.println(" originalMap "+originalMap);
        
        // how to check if the string is the same (VaibhavPawanChoudhary) to (ChoudharyVaibhavPawan)(code)
        String s1 = "VaibhavPawanChoudhary"; 
        String s2 = "ChoudharyVaibhavPawan";
        
//        s1 = s1.replaceAll("\\s", "").toLowerCase();
//        s2 = s2.replaceAll("\\s", "").toLowerCase();
//        
//        char[] charArr1 = s1.toCharArray();
//        char[] charArr2 = s2.toCharArray();
//        
//        Arrays.sort(charArr1);
//        Arrays.sort(charArr2);
//        
//        Boolean flag = Arrays.equals(charArr1, charArr2);
//        if(flag) {
//        	System.out.println(" It's same ");
//        } else {
//        	System.out.println(" It's not same ");	
//        }
        
//        Boolean flag = Arrays.stream(s1.split("")).sorted().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString().
//        	equals(Arrays.stream(s2.split("")).sorted().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString());
//        if(flag) {
//        	System.out.println(" It's same ");
//        } else {
//        	System.out.println(" It's not same ");	
//        }
        
        
	}

}
