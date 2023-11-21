package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaNormalCodePractice3 {

	public static void main(String[] args) {
		
		int arr[] = {132,22,24,54,56,23,22};
		
		// Given a list of Integers, find out if all the even numbers exist in the list using Stream functions.
//		Arrays.stream(arr).filter(i-> i%2==0).forEach(System.out::println);
		
		// Given a list of integers, find out all the numbers starting with 1 using Stream functions.
//		Arrays.stream(arr).filter(s -> String.valueOf(s).startsWith("1")).forEach(System.out::println);
		
		// How to find duplicate elements in a given integers list in Java using Stream functions?
//		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream()
//				.filter(i -> i.getValue() > 1).map(Map.Entry::getKey).forEach(System.out::println);
		
		List<Integer> listOfIntegers = Arrays.asList(4,3,2,5,2,3,5,6,8,5,7);
		
		// Given the list of integers, find the first element of the list using Stream functions.
//		System.out.println(listOfIntegers.stream().findFirst());
		
		// Given a list of integers, find the total number of elements present in the list using Stream functions.
//		long count = listOfIntegers.stream().count();
		
		// Given a list of integers, find the maximum value element using Stream functions.
//		Optional<Integer> maxValue = listOfIntegers.stream().max(Comparator.naturalOrder());
		
		// Given a String, find the first non-repeated character in it using Stream functions.
		
		// Given a String, find the first repeated character in it using Stream functions.
		
		// Given a list of integers, sort all the values present in it using Stream functions.
//		listOfIntegers.stream().sorted().forEach(System.out::println);
		
		//  Given a list of integers, sort all the values in descending order using Stream functions.
//		listOfIntegers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
	}	
}
