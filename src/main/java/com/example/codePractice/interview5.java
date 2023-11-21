package com.example.codePractice;

public class interview5 {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,6}; 
		
		// 5 + 1 = 6
		int n = arr.length + 1;
		// 6 * (6+1) / 2 
		int expectedSum = n * (n+1) / 2;
		System.out.println("expectedSum "+expectedSum);
		
		int actualSum = 0;
		for (int j : arr) {
			actualSum += j;
		}
		
		System.out.println("actualSum"+actualSum);
		
		int missingElement = expectedSum - actualSum;
		
		System.out.println(" missingElement is "+missingElement);
		
		
		
		
	}

}
