package com.example.threaddeadlock;

public class RaceConditionExample {

	private static int raceCounting = 0;
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(() -> {
			for(int i = 0; i < 1000000; i++) {
				raceCounting++;
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for(int i = 0; i < 1000000; i++) {
				raceCounting++;
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(" Final value of raceConditon "+raceCounting);
	}

}
