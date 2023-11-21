package com.example.threaddeadlock;

public class DeadlocalExample {

	private static Object resource1 = new Object();
	private static Object resource2 = new Object();
	
	public static void main(String[] args) {
		
		Thread  thread1 = new Thread(() -> {
			synchronized(resource1) {
				System.out.println("Thread 1 : holding Resource 1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 1 : waiting for Resource 2");
				synchronized (resource2) {
					System.out.println("Thread 1 : Acquired Resource 2");
				}
			}
		});
		
		Thread  thread2 = new Thread(() -> {
			synchronized(resource2) {
				System.out.println("Thread 2 : holding Resource 2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 2 : waiting for Resource 1");
				synchronized (resource1) {
					System.out.println("Thread 2 : Acquired Resource 1");	
				}
			}
		});		
		
		thread1.start();
		thread2.start();
	}
}
