package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

public class JavaNormalCodePractice5 {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 24 ,"HR", 25000 , "Active"));
        employees.add(new Employee("Alice", 34 , "IT", 45000 , "Active"));
        employees.add(new Employee("Bob", 42 ,"IT", 35000 , "Inactive"));
        employees.add(new Employee("Eva", 32 , "Finance", 30000 , "Active"));
		
        // Write a program to print employee details working in each department.
//        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((departMent, employeeList) -> {
//        	System.out.println("Department : "+departMent);
//        	employeeList.forEach(employee -> {
//        		System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge());
//        	});
//        });
        
        // Write a program to print employee counts working in each department.
//        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).forEach((departMent,count) -> {
//        	System.out.println(" Department : "+departMent+" Count "+count);
//        });

        // Write a program to print active and inactive employees in the given collection.
//        employees.stream().collect(Collectors.groupingBy(Employee::getStatus)).forEach((status, employeeList) -> {
//            System.out.println("Employee Status: " + status);
//            employeeList.forEach(employee ->
//                System.out.println("Employee Name: " + employee.getName())
//            );
//            System.out.println("=================================");
//        });
		
        // Write a program to print Max/Min employee salaries from the given collection.
//        employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
//        employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
        
        // Write a program to print the max salary of an employee from each department.
//        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))).forEach((department,employee) -> {
//        	System.out.println(" Department : "+department+" (Max)Salary "+employee.get().getSalary());
//        });
        
        // Java 8 Program to add prefixes and suffixes to the String?
        
        // Java 8 Program to add prefix and suffix to the String?
//        StringJoiner sj = new StringJoiner(",", "#", "#");
//        sj.add("First");
//        sj.add("First");
//        sj.add("First");
//        System.out.println(" After adding Prefix and Suffix "+sj.toString());
        
        
        // Java 8 Program to Print ten random numbers using forEach?
//        Stream.generate(() -> new Random().nextInt(100)).limit(10).forEach(System.out::println);
        
        // Java 8 program to iterate a Stream using the forEach method?
        
        // Java 8 program to find the Minimum number of a Stream?
//        Integer min = Stream.of(1,23,3,4,2,3,2,2,131,4,2,3).min(Comparator.comparingInt(Integer::valueOf)).get();
//        System.out.println(" Min "+min);
        
        // Java 8 program to find the Maximum number of a Stream?
//        Integer min = Stream.of(1,23,3,4,2,3,2,2,131,4,2,3).max(Comparator.comparingInt(Integer::valueOf)).get();
//        System.out.println(" Max "+min);
        
        // Java 8 program to Count Strings whose length is greater than 3 in List?
        
        // Java 8 program to Print Strings whose length is greater than 3 in List.
        
        // Java 8 program to multiply 3 to all elements in the list and print the list?
        
        // Java 8 program to perform concatenation on two Streams?
//        Stream<String> sts1 = Stream.of("A","B","C");
//        Stream<String> sts2 = Stream.of("D","E","F");
//        Stream<String> sts3 = Stream.concat(sts1, sts2);
        
        // Java 8 program to remove the duplicate elements from the list?
//        Stream.of("A","B","C","A").collect(Collectors.toSet()).forEach(System.out::println);
        
        // Print the current date and time in Java 8 Date and Time API?
//        System.out.println(java.time.LocalDate.now());
//        System.out.println(java.time.LocalDateTime.now());
//        System.out.println(java.time.LocalTime.now());
    
        // Write a Java 8 program to get the sum of all numbers present in a list?
//        List<Integer> list = Stream.of(4,2,4,24).collect(Collectors.toList());
//        int sum = list.stream().mapToInt(Integer::intValue).sum();		
//        System.out.println(" Sum "+sum);
        
        // Java 8 program to perform cube on list elements and filter numbers greater than 50.
        
        
	}

}
