package com.example.demo;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.lang.model.element.Element;

public class JavaNormalCodePractice8 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    list.add(4);
	    list.add(5);
	      
	    List<Integer> list1 = new ArrayList<>();
	    list1.add(1);
	    list1.add(24);
	    list1.add(33);
	    list1.add(45);
	    list1.add(41);
	    list1.add(57);
		
		// Write a program to find the common elements between two ArrayLists.
//	    list.stream().distinct().filter(list1::contains).forEach(System.out::println);
		
	    // Write a program to reverse an ArrayList.
//	    Collections.reverse(list1);
//	    System.out.println(" Reversed Arrayslist "+list1);
	    
//	    list1.stream().collect(Collectors.collectingAndThen(Collectors.toList(), result -> {
//	    	Collections.reverse(result);
//	    	return result;
//	    })).forEach(System.out::println);
	    
	    // Write a program to remove all the elements from an ArrayList that are divisible by 3.
//	    list1.stream().filter(i -> i%3 != 0).forEach(System.out::println);
	    
	    // Write a program to find the intersection of two ArrayLists.
//	    list.stream().distinct().filter(list1::contains).forEach(System.out::println);
		
	    // Write a program to find the union of two ArrayLists.
//	    Stream.concat(list.stream(), list1.stream()).distinct().sorted().forEach(System.out::println);
	    
	    // Write a program to find the maximum and minimum elements in an ArrayList.
//	    int i = list1.stream().max((a,b) -> a-b).get();
//	    System.out.println(" Maximum Element "+i);
//	    
//	    int j = list1.stream().min((a,b) -> a-b).get();
//	    System.out.println(" Minimum Element "+j);
	    
	    // Write a program to find the nth smallest element in an ArrayList.
//	    int n = 4;
//	    int i = list1.stream().distinct().sorted().skip(n-1).findFirst().get();
//	    System.out.println(" nth Smallest Element "+i);
	    
	    // Write a program to find the nth greatest element in an ArrayList.
//	    int n = 2;
//	    int i = list1.stream().distinct().sorted(Collections.reverseOrder()).skip(n-1).findFirst().get();
//	    System.out.println(" nth Greatest Element "+i);
	    
	    // Write a program to convert an ArrayList to an array.
//	    Integer[] array = list1.stream().toArray(Integer[]::new);
//	    System.out.println(Arrays.toString(array));
	    
	    // Write a program to create a new ArrayList that contains only the even elements from the original ArrayList.
//	    List<Integer> list2 =  list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//	    System.out.println(" List "+list2);
	    
	    // Write a program to create a new ArrayList that contains only the odd elements from the original ArrayList.
//	    List<Integer> list2 =  list1.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
//	    System.out.println(" List "+list2);
	    
	    // Write a Java program to remove all duplicates from an ArrayList.
//	    list1.stream().distinct().forEach(System.out::println);
	    
	    LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(15);
        linkedList.add(25);
        linkedList.add(30);
	    
	    // Write a Java program to remove all elements from a LinkedList that are greater than a given value.
//        linkedList.removeIf(element -> element > 20);
//	    System.out.println(" LinkedList "+linkedList);
	    
	    
	    HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("banana");
        stringHashSet.add("apple");
        stringHashSet.add("grape");
        stringHashSet.add("orange");
        stringHashSet.add("pear");
        
	    // Write a Java program to sort a HashSet of Strings in alphabetical order.
//	    TreeSet<String> treeSet = new TreeSet<>(stringHashSet);
//	    System.out.println(" Alphabetical order "+treeSet);
	    
//	    stringHashSet.stream().sorted().forEach(System.out::println);
	    
        // Write a Java program to find the median of an ArrayList of integers.
        
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(15);
        linkedList1.add(20);
        linkedList1.add(35);
        linkedList1.add(40);
        
        // Write a Java program to find the difference between two LinkedLists.
//        LinkedList<Integer> difference = new LinkedList<>(linkedList);
//        difference.removeAll(linkedList1);
//        System.out.println(" Difference "+difference);
        
        // Write a Java program to implement a HashSet using a HashMap.
        
        // Write a Java program to find the maximum and minimum elements in a TreeSet.
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        treeSet.add(10);
//        treeSet.add(5);
//        treeSet.add(20);
//        treeSet.add(15);
//        treeSet.add(25);
//        
//        System.out.println(" Minimum Element "+treeSet.first());
//        System.out.println(" Maximum Element "+treeSet.last());
        
        // Write a Java program to implement a stack using an array.
        
        // Write a Java program to implement a custom TreeMap that stores values in descending order
        
        
        
	}

}
