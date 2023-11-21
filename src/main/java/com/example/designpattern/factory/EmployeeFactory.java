package com.example.designpattern.factory;

public class EmployeeFactory {

	// Get the Employee 
	public static Employee getEmployee(String empType){
		
		if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
			return new AndroidDeveloper();
		} else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER")){
			return new WebDeveloper();
		} else {
			return null;
		}
		
	}
	
	
}
