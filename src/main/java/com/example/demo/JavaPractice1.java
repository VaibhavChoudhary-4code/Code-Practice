package com.example.demo;

/**
 * @author Vaibhav.P
 *
 */
public class JavaPractice1 {

	public static void main(String[] args) {
		System.out.println("Hello World11");

		double x = 2.23;
		double y = 1.34;

		int result = Double.compare(x, y);

		if (result < 0) {
		    System.out.println("x is less than y");
		} else if (result > 0) {
		    System.out.println("x is greater than y");
		} else {
		    System.out.println("x is equal to y");
		}
	}



}


