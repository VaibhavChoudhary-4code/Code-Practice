package com.example.designpattern.factory;

public class DeveloperClientMain {

	public static void main(String[] args) {
		
		Employee emp = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
		int salary = emp.getEmployee();
		System.out.println("Salary "+salary);
		
		Employee emp1 = EmployeeFactory.getEmployee("WEB DEVELOPER");
		System.out.println(emp1.getEmployee());
	}

}
