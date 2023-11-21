package com.example.designpattern.factory;

public class WebDeveloper implements Employee{

	@Override
	public int getEmployee() {
		System.out.println("Getting WebDeveloper");
		return 5000;
	}

}
