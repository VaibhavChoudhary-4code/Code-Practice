package com.example.codePractice;

import java.util.function.Predicate;

class ReusablePredicates {
	
	public static Predicate<Integer> isEven(){
		return number -> number%2 == 0; 
	}
	
	public static Predicate<Integer> isPositive(){
		return number -> number > 0; 
	}
	
	public static Predicate<Integer> isGreaterThen(int thresold){
		return number -> number > thresold; 
	}
	
}

public class Interview2 {

	public static void main(String[] args) {
		
		// Implement Reusable Predicate 
		Predicate<Integer> evenPredicate = ReusablePredicates.isEven();
		Predicate<Integer> positivePredicate = ReusablePredicates.isPositive();
		Predicate<Integer> greaterThenPredicate = ReusablePredicates.isGreaterThen(4);
		
		System.out.println(evenPredicate.test(4));
		System.out.println(positivePredicate.test(-334));
		System.out.println(greaterThenPredicate.test(6));
		
		// Implement thread using java8
		Object lock = new Object();
		
		Thread thread = new Thread(() -> {
			synchronized(lock) {
				for (int i = 0; i < 5; i++) {
					System.out.println(" Thread is Running "+i);
					try {
						Thread.sleep(1000);
					}catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread thread1 = new Thread(() -> {
			synchronized(lock) {
				for (int i = 0; i < 5; i++) {
					System.out.println(" Thread1 is Running "+i);
					try {
						Thread.sleep(1000);
					}catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		});
		
		thread.start();
		
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		thread1.start();
		
		System.out.println(" Thread is finished ");
		 
	}

}
