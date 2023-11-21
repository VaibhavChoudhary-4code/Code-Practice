package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.hibernate.mapping.Collection;

public class JavaNormalCodePractice7 {

	public static void main(String[] args) {
		
		// Sorting an array in Java.
		int arr[] = {334,2442,3,242,1,13,313,134};
//		Arrays.sort(arr);
//		System.out.println(" Sorting Array "+Arrays.toString(arr));
		
		// Find the second-largest number in the array.
//		int n = Arrays.stream(arr).boxed().sorted((a,b) -> b-a).distinct().skip(1).findFirst().get();
//		System.out.println(" Second largest Value in array "+n);
		
		// OR
		
//		System.out.println(" Second largest Value in array "+arr[arr.length - 2]);
		
		// Write a Java Program to count the number of chars in a string using HashMap.
//		String s = "Vaibhav";
		
//		s.toLowerCase().chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity() , Collectors.counting())).forEach((chars,count) -> {
//			System.out.println(" Characters "+chars+" Count "+count);
//		});
		
		// Write a Java Program to iterate HashMap using While and advance for a loop.
		
//		Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("one", 1);
//        hashMap.put("two", 2);
//        hashMap.put("three", 3);
//        hashMap.put("four", 4);
//        hashMap.put("five", 5);
//        
//        java.util.Iterator<Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
//        
//        while(iterator.hasNext()) {
//        	Map.Entry<String,Integer> entry = iterator.next(); 
//        	System.out.println(" Key "+entry.getKey()+" Value "+entry.getValue());
//        }
//        	
//        for (Map.Entry<String,Integer> entry : hashMap.entrySet()) {
//			System.out.println(" Key "+entry.getKey()+" Value "+entry.getValue());
//		}
		
        // Sorting a HashMap according to keys in Java.
//        Map<String,Integer> sortedMap = new TreeMap<>(hashMap);
//        
//        for(Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
//        	System.out.println(" Key "+entry.getKey()+" Value "+entry.getValue());
//        }
		
        // Find the Second largest element in an array. (without using any inbuilt function & with using an inbuilt function)
        
        // find the first non-repeating characters in the string.
//        s.toLowerCase().chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity() , LinkedHashMap::new ,Collectors.counting())).forEach((chars,count) -> {
//			if(count == 1) {
//				System.out.println(" Characters "+chars+" Count "+count);
//			}
//		});
        
        // Merge two sorted arrays.
        
//        int[] arr1 = { 1, 3, 5, 7 };
//        int[] arr2 = { 2, 4, 6, 8, 10 };
//        int[] arr3 = { 3, 2, 1, 5, 4 };
//        
//        System.out.println(Arrays.toString(IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray()));
        
        // find the maximum and minimum elements in an array.
        
//        int maxElement = Arrays.stream(arr2).max().getAsInt();
//        int minElement = Arrays.stream(arr2).min().getAsInt();
//        System.out.print(" Max Element "+maxElement+" Min Element "+minElement);
        
        // Find the kth largest element in an unsorted array.
        
//        int k = Arrays.stream(arr3).boxed().sorted((a,b) -> b-a).limit(4).skip(4-1).findFirst().get();
//        System.out.println(" kth largest element "+k);
        
        // how to reverse a list in Java.
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(4);
//        list.add(5);
//        
//        List<Integer> list1 = new ArrayList<>();
//        list.add(14);
//        list.add(24);
//        list.add(33);
//        list.add(45);
//        list.add(41);
//        list.add(57);
//        
//        Collections.reverse(list);
//        
//        System.out.println(" Reversed List "+list);
//        
//        list.stream().collect(Collectors.collectingAndThen(Collectors.toList(), result -> {
//        	Collections.reverse(result);
//        	return result;
//        })).forEach(System.out::println);;
        
        // Write a program to find the second-highest element in an ArrayList.
//        int i = list.stream().sorted((a,b) -> b-a).distinct().skip(1).findFirst().get();
//        System.out.println(" Second Highest Number in Arraylist : "+i);
        
        // Write a program to remove duplicates from an ArrayList.
//        list.stream().distinct().forEach(System.out::println);;
        
        // Write a program to merge two ArrayLists into a single ArrayList.
//        Stream.concat(list.stream(), list1.stream()).sorted().collect(Collectors.toList()).forEach(System.out::println);;
        
        // Write a program to sort an ArrayList in descending order.
//        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        
        // Implement binary search on sorted array.
//        int i1 = Arrays.binarySearch(arr3, 4);
//        System.out.println(" Binary Search Index "+i1);
        
        
        
	}

}
