package com.example.demo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties.SameSite;

public class JavaCodePractice2{

	public static void main(String[] args) {
		
		// character count of string using java8 and java7 both.
		
		String s = "Vaibhav";
		
//		s.toLowerCase().chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new , Collectors.counting()))
//				.entrySet().stream().filter(entry -> entry.getValue() == 1).limit(1).forEach(System.out::println);
		
//		HashMap<Character,Integer> obj = new HashMap<>();
//		
//		char[] arr = s.toLowerCase().toCharArray();
//		for (char c : arr) {
//			if(obj.containsKey(c)) {
//				obj.put(c, obj.get(c)+1);
//			} else {
//				obj.put(c, 1);
//			}
//		}
//		
//		System.out.println(" Character Count "+ch);
		
//		char[] str = s.toLowerCase().toCharArray();
//		
//		int count = 0;
//		for (int i = 0; i < str.length; i++) {
//			count = 1;
//			
//			for (int j = i+1; j < str.length; j++) {
//				if(str[i] == str[j] && str[i] != ' ') {  
//					count++;
//					
//					str[j] = '0';
//				}
//			}
//		
//			if(count > 1 && str[i] != '0') {
//				System.out.println(" Duplicate char is "+str[i]);
//			}
//		}
		
		
		// Sort the array using java7,8 and for loop.
//		Integer[] arr = {34,32,57,31,8,44,89};
		
//		Arrays.sort(arr);		
//		System.out.println(" Sorted Array is "+Arrays.toString(arr));
		
//		Stream.of(arr).sorted((a,b) -> b-a).forEach(System.out::println);
		
//		for (int i = 0; i < arr.length - 1; i++) {
//			
//			if(arr[i] > arr[i+1]) {
//				
//				int temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//				
//				i = -1;
//			}
//		}
//		
//		System.out.println(" Sorted Array is "+Arrays.toString(arr));
		
		Integer[] arr = {34,32,57,31,8,44,89};
		
		// Given an array find the third largest number in it using java8 & 7 both. (code)
//		Stream.of(arr).sorted(Collections.reverseOrder()).skip(2).limit(1).forEach(System.out::println);
		
//		Arrays.sort(arr);	
//		System.out.println(" Third Largst Number is "+arr[arr.length - 3]);
		
//		for (int i = 0; i < arr.length - 1; i++) {
//			if(arr[i] > arr[i+1]) {
//				int temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//			}
//		}
//		System.out.println(" Third Largst Number is "+arr[arr.length - 3]);

		// Get the second largest salary in employee list?
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("John Doe", 30, "IT", 60000, "Active", "Male", LocalDate.of(2009, 2, 13)));
		employees.add(new Employee("Jane Smith", 25, "HR", 55000, "Active", "Female", LocalDate.of(2012, 8, 23)));
		employees.add(new Employee("Michael Johnson", 35, "Finance", 70000, "Active", "Male", LocalDate.of(2016, 2, 29)));
		employees.add(new Employee("Emily Brown", 28, "Marketing", 58000, "Active", "Female", LocalDate.of(2019, 9, 1)));
		employees.add(new Employee("William Wilson", 30, "Sales", 75000, "Active", "Male", LocalDate.of(2022, 3, 14)));
		employees.add(new Employee("Olivia Miller", 27, "IT", 62000, "Active", "Female", LocalDate.of(2016, 7, 30)));
		employees.add(new Employee("James Jones", 32, "Finance", 72000, "Active", "Male", LocalDate.of(2013, 1, 21)));
		employees.add(new Employee("Ava Davis", 29, "HR", 56000, "Active", "Female", LocalDate.of(2013, 6, 3)));
		employees.add(new Employee("Liam Martinez", 31, "Sales", 73000, "Active", "Male", LocalDate.of(2013, 6, 15)));
		employees.add(new Employee("Sophia Garcia", 26, "Marketing", 59000, "Active", "Female", LocalDate.of(2017, 9, 14)));
		
//		Employee i = employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary))).skip(1).findFirst().get();
//		System.out.println("The second largest salary is " + i.getSalary());
		
//		employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
//		Double secondLargestSalary = employees.get(1).getSalary();
//      System.out.println("The second largest salary is " + secondLargestSalary);
 		
		
		// From Employee List Sort Name and ascending and salary in descending order?
//		employees.stream().sorted(Comparator.comparing(Employee::getName).reversed().thenComparing(Employee::getSalary)).forEach(System.out::println);
		
		// Create Thread using Java8 & also use runnable?
		
//		Thread thread = new Thread(() -> {
//			for (int i = 0; i < 5; i++) {
//				System.out.println(" Count "+i);
//			}
//		});
//		thread.start();
		
		
//		Runnable runnable = () -> {
//			for (int i = 0; i < 5; i++) {
//				System.out.println(" Count "+i);
//			}
//		};
//		
//		Thread thread = new Thread(runnable);
//		thread.start();
		
//		Thread thread1 = new Thread(runnable);
//		thread1.start();
		
		// input: abc{def}ghijkl{mnop}qrst && Output: abc{fed}ghijkl{ponm}qrst (code)
		
//		String firstString = "abc{def}ghijkl{mnop}qrst";
//		
//		StringBuilder reverseString = new StringBuilder();
//		StringBuilder curlyBraces = new StringBuilder();
//		Boolean flag = false;
//		
//		for (char c : firstString.toCharArray()) {
//			
//			if(c == '{') {
//				flag = true;
//				continue;
//			} else if(c == '}') {
//				flag = false;
//				reverseString.append("{"+curlyBraces.reverse());
//				curlyBraces.setLength(0);
//			} 
//			
//			if(flag) {
//				curlyBraces.append(c);
//			} else {
//				reverseString.append(c);
//			}
//		}
//		System.out.println(reverseString.toString());
		
		// write code the check is string is palindrome or not? (code)
		
		
		// String is anagram or not? (code)
//		String anagram1 = "aba";
//		String anagram2 = "aafb";
//		
//		char s1[] = anagram1.toCharArray();
//		char s2[] = anagram2.toCharArray();
//		
//		Arrays.sort(s1);
//		Arrays.sort(s2);
//		
//		Boolean isEquals = Arrays.equals(s1, s2);
//		
//		if(isEquals) {
//			System.out.println(" It's Anagram ");
//		}
		
		// Write one code for getting the missing element from sorted array? (code)
		
//		int arr1[] = {1,2,4,5,6,7};
//		
//		int n = arr1.length + 1;
//		System.out.println(" n "+n);
//		int extectedSum = n * (n+1)/2;
//		System.out.println(" extectedSum "+extectedSum);
//		
//		int actualSum = 0;
//		for (int i : arr1) {
//			actualSum += i;
//		}
//		
//		int missingElement = extectedSum - actualSum;
//		
//		System.out.println(" missingElement "+missingElement);
		
		
		// How to run two threads parallel?
		
//		Object lock = new Object();
//		
//		Thread thread = new Thread(() -> {
//			for (int i = 0; i < 5; i++) {
//				synchronized (lock) {
//					System.out.println(" Thread 1 - "+i);
//					
//					lock.notify();
//					try {
//						lock.wait();
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		});
//		
//		Thread thread1 = new Thread(() -> {
//			for (int i = 0; i < 5; i++) {
//				synchronized (lock) {
//					System.out.println(" Thread 2 - "+i);
//					
//					lock.notify();
//					try {
//						lock.wait();
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		});
//		
//		thread.start();
//		thread1.start();
		
		// Write a program about first non repeated characters in string?
//		s.toLowerCase().chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
//				.filter(entry -> entry.getValue() == 1).limit(1).forEach(System.out::println);
		
		// how to check if the string is the same (VaibhavPawanChoudhary) to (ChoudharyVaibhavPawan)
		String str = "VaibhavPawanChoudhary";
		String str1 = "ChoudharyVaibhavPawan";
		
		char[] a1 = str.toLowerCase().toCharArray();
		char[] a2 = str1.toLowerCase().toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		Boolean flag = Arrays.equals(a1, a2);
		System.out.println(" flag "+flag);
		
		
		
	}

}
