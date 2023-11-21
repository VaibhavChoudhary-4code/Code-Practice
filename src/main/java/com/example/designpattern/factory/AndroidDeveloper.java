package com.example.designpattern.factory;

public class AndroidDeveloper implements Employee{

	@Override
	public int getEmployee() {
		System.out.println("Getting AdnroidDeveloper");
		return 4000;
	}

}
