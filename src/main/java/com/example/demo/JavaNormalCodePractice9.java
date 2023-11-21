package com.example.demo;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.util.comparator.Comparators;

public class JavaNormalCodePractice9 {

	public static void main(String[] args) {

		// how to implement optional in Java8.

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
		
		// How would you find the average age of all employees?
//		Double i = employees.stream().collect(Collectors.averagingInt(Employee::getAge));
//		System.out.println(" Average age : "+i);
		
		// How would you find the highest salary among all employees?
//		Employee maxSalaryEmp = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
//		System.out.println(" Max Salary "+maxSalaryEmp);
		
		// How would you find the total salary of all employees in a specific department?
//		Double totalSalary = employees.stream().filter(i -> i.getDepartment().equals("Finance")).mapToDouble(Employee::getSalary).sum();
//		System.out.println(" Total Salary of Department "+totalSalary);
		
		// How would you sort the employees by their age in ascending order?
//		employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);;
		
		// How would you filter the employees who have a salary greater than a certain amount?
//		employees.stream().filter(i-> i.getSalary() > 60000).map(i -> i.getName()).forEach(System.out::println); 
		
		// How would you group the employees by their department and calculate the average salary for each department?
//		Double averageSalByDept = employees.stream().filter(i -> i.getDepartment().equals("Finance")).collect(Collectors.averagingDouble(Employee::getSalary));
//		System.out.println(" Average Salary of Department "+averageSalByDept);
		
		// How would you calculate the total salary of all employees using parallel stream processing?
//		Double sumOfSalary = employees.parallelStream().mapToDouble(Employee::getSalary).sum();
//		System.out.println(" Sum of Salary "+sumOfSalary);
		
		// How would you find the youngest employee in a specific department?
//		Employee youngEmp = employees.stream().min(Comparator.comparing(Employee::getAge)).get();
//		System.out.println(" Young Employee "+youngEmp);
		
		// How would you calculate the sum of all salaries using the reduce method?
//		Double sumOfSalary = employees.stream().mapToDouble(Employee::getSalary).reduce(0.0,(a,b) -> a+b);
//		System.out.println(" Sum of salary "+sumOfSalary);
		
		// How would you find the employees with the highest salary in each department?
//		employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summarizingDouble(Employee::getSalary))).forEach((dept,emp) -> {
//			System.out.println(" Department "+dept+" Employee Max Salary "+emp.getMax());
//		});
		
		// How would you group the employees by their age and calculate the average salary for each age group?
//		employees.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.averagingDouble(Employee::getSalary))).forEach((age,emp) -> {
//			System.out.println(" Age "+age+" Employee "+emp);
//		});
		
		// How would you find the number of employees in each department?
//		employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).forEach((dept,count) -> {
//			System.out.println(" Deptartment "+dept+" Count "+count);
//		});
		
		// How would you filter the employees who have a salary between a certain range?
//		employees.stream().filter(emp -> emp.getSalary() > 60000 && emp.getSalary() < 70000).forEach(System.out::println);
		
		// How would you sort the employees by their salary in descending order?
//		employees.stream().sorted((a,b) -> Double.compare(b.getSalary(),a.getSalary())).forEach(System.out::println);
//		employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);
		
		// How would you find the employee with the highest salary?
//		Employee heighestSalary = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
//		System.out.println(" Highest Salary "+heighestSalary);
		
		// How would you group the employees by their department and sort them by their salary in descending order within each department?
//		Map<String, List<Employee>> empByDeptSalDecending = employees.stream()
//				.collect(Collectors.groupingBy(Employee::getDepartment,
//						Collectors.collectingAndThen(Collectors.toList(),
//								list -> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//										.collect(Collectors.toList()))));
//		empByDeptSalDecending.forEach((department,empList) -> {
//			System.out.println(" Department "+department);
//			empList.forEach(employee -> System.out.println(" Salary "+employee.getSalary()));
//		});
		
		// How would you find the average salary of employees who are older than a certain age?
//		Double avgSalByAge = employees.stream().filter(i -> i.getAge() > 30).collect(Collectors.averagingDouble(Employee::getSalary));
//		System.out.println(" Average salary by department "+avgSalByAge);
		
		// How would you find the employee with the lowest salary in each department?
//		employees.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.minBy(Comparator.comparing(Employee::getSalary)))).forEach((dept, emp) -> {
//			System.out.println(" Department "+dept+" Employee "+emp);
//		});
		
		// How would you calculate the sum of all salaries using the parallel reduce method?
//		Double totalSalary = employees.stream().parallel().reduce(0.0, (a,b) -> a+b.getSalary() , Double::sum);
//		System.out.println(" Sum of salarie "+totalSalary);
		
//		Double totalSalary = employees.parallelStream().mapToDouble(Employee::getSalary).reduce(0.0, (a,b) -> a+b);
//		System.out.println(" Sum of salarie "+totalSalary);
		
		// How would you find the number of employees in each department who have a salary greater than a certain amount?
//		employees.stream().filter(i-> i.getSalary() > 60000).collect(Collectors.groupingBy(Employee::getDepartment)).forEach((dept,empList) -> {
//			System.out.println(" Department "+dept);
//			empList.forEach(emp -> {
//				System.out.println(" Employee "+emp);
//			});
//		});
		
	
		// How would you group the employees by their age and sort them by their salary in descending order within each age group,while retaining only the top 3 employees in each age group?
//		employees.stream()
//				.collect(Collectors.groupingBy(Employee::getAge,
//						Collectors.collectingAndThen(Collectors.toList(),
//								empList -> empList.stream()
//										.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3)
//										.collect(Collectors.toList()))))
//				.forEach((age, empList) -> {
//					System.out.println(" Age " + age);
//					empList.forEach(emp -> System.out.println(" Employee " + emp.getName()));
//				});
		
		// How would you find the employee with the highest salary who is older than a certain age and works in a specific department?
//		Employee emp = employees.stream().filter(i -> i.getAge() > 30 && i.getDepartment().equals("Finance")).max(Comparator.comparing(Employee::getSalary)).get();
//		System.out.println(" Employee With Heighest Salary with Specific Age & Department "+emp);
		
		// How would you calculate the sum of all salaries using the Fork/Join framework?
		
		// How would you group the employees by their department and calculate the sum of salaries for employees who are younger than a certain age, 
		// while filtering out departments where the total salary is less than a certain amount?
//		double amount = 100000; 
//		Map<String, DoubleSummaryStatistics> departmentSummary = employees.stream().filter(i -> i.getAge() > 30).collect(Collectors.groupingBy(Employee::getDepartment , Collectors.summarizingDouble(Employee::getSalary)));
//
//		departmentSummary.entrySet().removeIf(entry -> entry.getValue().getSum() < amount);
//		
//		departmentSummary.forEach((dept, summary) -> {
//			System.out.println(" Department "+dept);
//			System.out.println(" Total Salary "+summary.getSum());
//		});
		
		
		// How would you find the employee with the highest salary who has been with the company for a specific number of years or more, 
		// using a custom employee object that includes the hire date?
//		Employee emp = employees.stream().filter(i -> i.getJoinDate().isAfter(LocalDate.of(2022, 3, 11))).max(Comparator.comparing(Employee::getSalary)).orElse(null);
//		System.out.println(" Employee with highest salary hired after "+LocalDate.of(2022, 3, 11)+" : "+emp.getSalary());
		
		
		int[] playerIDs = new int[11];
	    
	    Arrays.fill(playerIDs,1);
	    
	    System.out.println(" A new cricket team has been formed ");
	    
	}

}
