package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaPractice2 {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", 25, "Marketing", 50000.0));
        employees.add(new Employee("Bob", 30, "Sales", 60000.0));
        employees.add(new Employee("Charlie", 35, "Finance", 70000.0));
        employees.add(new Employee("David", 40, "Marketing", 80000.0));
        employees.add(new Employee("Emily", 45, "Sales", 90000.0));

        
        // How would you find the average age of all employees?
        double averageAge = employees.stream().mapToInt(Employee::getAge).average().orElse(Double.NaN);
        System.out.println("averageAge = "+averageAge);
        
        // How would you find the highest salary among all employees?
        double maxSalary = employees.stream().mapToDouble(Employee::getSalary).max().orElse(Double.NaN);
        System.out.println("averageAge = "+maxSalary);
        
        // How would you find the total salary of all employees in a specific department?
        Map<String,Double> departmentWiseTotalSalary = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        System.out.println("departmentWiseTotalSalary = "+departmentWiseTotalSalary);
        
        // How would you sort the employees by their age in ascending order?
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
        System.out.println("========================");
        
        // How would you filter the employees who have a salary greater than a certain amount?
        employees.stream().filter(i -> i.getSalary() > 50000).forEach(System.out::println);
        System.out.println("========================");
        
        // How would you group the employees by their department and calculate the average salary for each department?
        Map<String,Double> avrgSalFromEachDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        avrgSalFromEachDept.forEach((department , averageSalary) -> System.out.println(department+" = "+averageSalary));
        System.out.println("========================");
        
        // How would you calculate the total salary of all employees using parallel stream processing?
        double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("totalSalary = "+totalSalary);
        System.out.println("========================");
        
        // How would you find the youngest employee in a specific department?
		employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.minBy(Comparator.comparingInt(Employee::getAge))))
				.forEach((dept, emp) -> System.out.println(dept + " = " + emp.get().getAge()));
        
		// How would you calculate the sum of all salaries using the reduce method?
		double totalSal = employees.stream().mapToDouble(Employee::getSalary).reduce(0,Double::sum);
		System.out.println("totalSal = "+totalSal);
        
		// How would you find the employees with the highest salary in each department?
		employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))))
				.forEach((name, salary) -> System.out.println(name + "-" + salary));
                
		// How would you group the employees by their age and calculate the average salary for each age group?
		employees.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.averagingDouble(Employee::getSalary))).forEach((age,Salary) -> System.out.println(age+"-"+Salary));

		// How would you find the number of employees in each department?
		employees.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.counting())).forEach((department,count) -> System.out.println(department+"-"+count));
		
		// How would you filter the employees who have a salary between a certain range?
		employees.stream().filter(e -> e.getSalary() >= 30000 && e.getSalary() <= 80000).forEach(System.out::println);
		System.out.println("========================");
        
		// 1
		// How would you sort the employees by their salary in descending order?
		employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
		
		// How would you find the employee with the highest salary?
		double maxSalary1 = employees.stream().max(Collections.reverseOrder(Comparator.comparing(Employee::getSalary))).get().getSalary();
		System.out.println("maxSalary = "+maxSalary1);
		
		// How would you group the employees by their department and sort them by their salary in descending order within each department?
		employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.collectingAndThen(Collectors.toList(), list -> {
					list.sort(Comparator.comparing(Employee::getSalary).reversed());
					return list;
				})));
		
		// How would you find the average salary of employees who are older than a certain age?
		double averageSalary = employees.stream().filter(i -> i.getAge() < 39).mapToDouble(Employee::getSalary).average().orElse(Double.NaN);
		System.out.println("averageSalary = "+averageSalary);
		
		// How would you find the employee with the lowest salary in each department?
		employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.minBy(Comparator.comparing(Employee::getSalary))))
				.forEach((department, salary) -> System.out.println(department + "=" + salary.get().getSalary()));
		
		// 1
		// How would you calculate the sum of all salaries using the parallel reduce method?
		double sumofSalary = employees.parallelStream().mapToDouble(Employee::getSalary).sum();
		System.out.println("sumofSalary = "+sumofSalary);
		
		// How would you find the number of employees in each department who have a salary greater than a certain amount?
		employees.stream().filter(i -> i.getSalary() > 85000).collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).forEach((department,count) -> System.out.println(department+"="+count));
		
		// How would you group the employees by their age and sort them by their salary in descending order within each age group, while retaining only the top 3 employees in each age group?
		
		
	}
}
