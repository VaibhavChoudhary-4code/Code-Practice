package com.example.threaddeadlock;

import java.util.Iterator;

public class ContextSwitching {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread 1 : "+i);
				Thread.yield();
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread 2 : "+i);
				Thread.yield();
			}
		});
		
		thread1.start();
		thread2.start();
	}

}
