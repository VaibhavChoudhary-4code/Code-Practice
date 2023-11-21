package com.example.demo;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

	private String name;
	private int age;
	private String department;
	private double salary;
	private String status;
	private String gender;
	private LocalDate joinDate;
	
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, String department, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		salary = salary;
	}
	
	public Employee(String name, int age, String department, double salary, String status) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.status = status;
	}

	public Employee(String name, int age, String department, double salary, String status, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.status = status;
		this.gender = gender;
	}
	
	public Employee(String name, int age, String department, double salary, String status, String gender,
			LocalDate joinDate) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.status = status;
		this.gender = gender;
		this.joinDate = joinDate;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		salary = salary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + ", salary=" + salary
				+ ", status=" + status + ", gender=" + gender + ", joinDate=" + joinDate + "]";
	}
	
	
	
	
}
