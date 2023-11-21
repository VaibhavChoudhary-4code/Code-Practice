package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class JavaNormalCodePractice4 {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(442,4,3,2342,2,313,1,1313,1,31,42);
		
		// Given a list of Integers, find out if all the even numbers exist in the list using Stream functions.
//		listOfIntegers.stream().filter(i -> i%2==0).forEach(System.out::println);
		
		// Given a list of integers, find out all the numbers starting with 1 using Stream functions.
//		listOfIntegers.stream().filter(s -> String.valueOf(s).startsWith("1")).forEach(System.out::println);;
		
		// How to find duplicate elements in a given integers list in Java using Stream functions?
//		listOfIntegers.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream()
//				.filter(i -> i.getValue() > 1).map(Map.Entry::getKey).forEach(System.out::println);
		
		// Given the list of integers, find the first element of the list using Stream functions.
//		long count = listOfIntegers.stream().findFirst().get();
//		System.out.println("First Value : "+count);
		
		// Given a list of integers, find the total number of elements present in the list using Stream functions.
//		long count = listOfIntegers.stream().count();
		
		// Given a list of integers, find the maximum value element using Stream functions.
//		long count = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
//		System.out.println(" Maximum value : "+count);
		
		// Given a list of integers, sort all the values present in it using Stream functions.
//		listOfIntegers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		// Given a list of integers, sort all the values in descending order using Stream functions.
//		listOfIntegers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		String s = "Vaibhav";
		
		// Given a String, find the first non-repeated character in it using Stream functions.
		// Given a String, find the first repeated character in it using Stream functions.
//		char c = s.toLowerCase().chars().mapToObj(i -> (char) i)
//				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
//				.filter(i -> i.getValue() > 1).map(Map.Entry::getKey).findFirst().get();
//		System.out.println(" First Non-repeted character : "+c);
		
		
		
		
		
		
	}

}
