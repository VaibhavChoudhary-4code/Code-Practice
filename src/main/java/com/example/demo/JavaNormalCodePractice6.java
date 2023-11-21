package com.example.demo;

import java.lang.reflect.Array;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class JavaNormalCodePractice6 {

	public static void main(String[] args) {
		
		String s = "Vaibhav";
		
		// Find the occurrence of a character in a string in Java8?
//		s.toLowerCase().chars().mapToObj(t -> (char)t).collect(Collectors.groupingBy(t -> t , Collectors.counting())).forEach((character,count) -> {
//			System.out.println(" Characters "+character+" Count "+count);
//		});
		
		// Find the duplicate characters in a string using Java8?
//		s.toLowerCase().chars().mapToObj(t -> (char) t).collect(Collectors.groupingBy(t -> t, Collectors.counting()))
//				.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey)
//				.forEach(System.out::println);
		
		// Find the unique characters in the string using java8?
//		s.toLowerCase().chars().mapToObj(t -> (char) t).collect(Collectors.groupingBy(t -> t, Collectors.counting()))
//				.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey)
//				.forEach(System.out::println);
		
		// Find the first non-repeated character in a string?
//		s.toLowerCase().chars().mapToObj(t -> (char) t).collect(Collectors.groupingBy(t -> t, Collectors.counting()))
//		.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).limit(1)
//		.forEach(System.out::println);
		
		
		Integer[] numbers = { 10, 5, 8, 20, 15, 25, 18 };
		// Find the second-highest number in the array?
//		int n = Arrays.stream(numbers).distinct().sorted().skip(Math.max(0, numbers.length - 2)).findFirst().orElseThrow(() -> new IllegalArgumentException("No Second Highest Number Found"));
//		System.out.println(" Second Highest Number "+n);
		
		// Find the second lowest number in the array?
//		int n = Arrays.stream(numbers).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException(" No Second Lowest Number Found "));
//		System.out.println(" Second Lowest Number : "+n);
		
		String[] strings = { "Vaibhav", "Choudhary", "Rahul", "Mohan", "Rohan", "Amit", "Vishnu" };
		// Find the longest string in the array?
//		String s1 = Arrays.stream(strings).max((a,b) -> Integer.compare(a.length(), b.length())).get();
//		System.out.println(" Longest String "+s1);
		
		// Find the numbers which start with 1?
//		Arrays.stream(numbers).filter(j -> String.valueOf(j).startsWith("1")).forEach(System.out::println);
		
		// how to use String.join() method in java8?
//		String s2 = String.join("#", strings);
//		System.out.println(" String Join Example : "+s2);
		
		// Skip and limit examples in Java8?
		
//		List<Employee> employees = new ArrayList<>();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			employees.add(new Employee("John", 24, "HR", 25000, "Active", "Male", dateFormat.parse("2018-01-01")));
//			employees.add(new Employee("Alice", 34, "IT", 45000, "Active", "Female", dateFormat.parse("2011-07-15")));
//	        employees.add(new Employee("Bob", 42, "IT", 35000, "Inactive", "Male", dateFormat.parse("2020-04-10")));
//	        employees.add(new Employee("Eva", 34, "Finance", 30000, "Active", "Female", dateFormat.parse("2015-10-30")));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
        
		// How many male and female employees are there in the organization?
//		employees.stream().collect(Collectors.groupingBy(Employee::getGender , Collectors.counting())).forEach((gender,count) -> {
//			System.out.println(" Geneder "+gender+" Count "+count);
//		});
	
        // Print the name of all departments in the organization?
//        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().stream().map(Map.Entry::getKey).forEach(System.out::println);
        
        // What is the average age of male and female employees? 
//        employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))).forEach((gender,avgage) -> {
//        	System.out.println(" Gender : "+gender+" Average age : "+avgage);
//        });
        
        // Get the details of the highest-paid employee in the organization?
//        Employee highestSalary = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
//        System.out.println(" highest-paid employee "+highestSalary.getName());
        
//        double highestSalary = employees.stream().mapToDouble(Employee::getSalary).max().orElse(0.0);
//        System.out.println(" highest-paid salary "+highestSalary);
        
//        Employee highestSalary = employees.stream().max((a,b) -> Double.compare(a.getSalary() , b.getSalary())).get();
//        System.out.println(" highest-paid employee "+highestSalary.getName());
        
        // Get the names of all employees who have joined after 2015?
//       employees.stream().filter(emp -> emp.getJoinDate().after(new Date(115, 0, 1))).map(Employee::getName).forEach(System.out::println);
        
        // Count the number of employees in each department?
//        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.counting())).forEach((departmen,count) -> {
//        	System.out.println(" Departmen : "+departmen+" Employee Count "+count);
//        });
        
        // What is the average salary of each department?
//        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.averagingDouble(Employee::getSalary))).forEach((department,avgSalary) -> {
//        	System.out.println(" Department : "+department+" Average Salary "+avgSalary);
//        });
        
        // Get the details of the youngest male employee in the IT department?
//        Employee emp = employees.stream().filter(i -> i.getDepartment().equals("IT")).min((a,b) -> Integer.compare(a.getAge(), b.getAge())).get();
//        System.out.println(" Employee Details : "+emp);
        
        // Who has the most working experience in the organization?
//        Employee emp = employees.stream().max(Comparator.comparingInt(employee  -> {
//        	Instant instant = employee.getJoinDate().toInstant();
//        	ZoneId zoneId = ZoneId.systemDefault();
//        	ZonedDateTime zonDateTime = instant.atZone(zoneId);
//        	
//        	LocalDate joinDate = zonDateTime.toLocalDate();
//        	
//        	Period period = Period.between(joinDate, LocalDate.now());
//        	return period.getYears();
//        })).get();
//        System.out.println(" Most Working Experience : "+emp);
        
       // How many male and female employees are there in the IT team?
//		employees.stream().filter(i -> i.getDepartment().equals("IT")).collect(Collectors.groupingBy(Employee::getGender , Collectors.counting())).forEach((gender , count) -> {
//			System.out.println(" Geneder "+gender+" Count "+count);
//		});
		
		// What is the average salary of male and female employees?
//		employees.stream().collect(Collectors.groupingBy(Employee::getGender , Collectors.averagingDouble(Employee::getSalary))).forEach((gender , avgSalary) -> {
//			System.out.println(" Gender "+gender+" Average Salary "+avgSalary);
//		});
		
		// List down the names of all employees in each department?
//		employees.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.mapping(Employee::getName, Collectors.toList()))).forEach((department , empList) -> {
//			System.out.println(" Departmen "+department+" Employee "+empList);
//		});
		
		// What are the average salary and total salary of the whole organization?
//		DoubleSummaryStatistics summaryStatistics = employees.stream().mapToDouble(Employee::getSalary).summaryStatistics();
//		System.out.println(" Total Salary "+summaryStatistics.getSum());
//		System.out.println(" Average Salary "+summaryStatistics.getAverage());
		
		// Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
//		employees.stream().collect(Collectors.partitioningBy(employee -> employee.getAge() <= 25)).forEach((flag, empList) -> {
//			if (flag) {
//				System.out.println(" Younger then 25 ");
//			} else {
//				System.out.println(" Older then 25 ");
//			}
//			System.out.println(" Employee List "+empList);
//		});
		
		// Who is the oldest employee in the organization? What is his age and which department he belongs to?
//		Employee emp = employees.stream().max(Comparator.comparingInt(Employee::getAge)).get();
//		System.out.println(" Age "+emp.getAge()+" Department "+emp.getDepartment());
		
		
		
		
	}
}
