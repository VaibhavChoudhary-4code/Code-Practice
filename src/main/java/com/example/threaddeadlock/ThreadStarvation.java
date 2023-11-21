package com.example.threaddeadlock;

public class ThreadStarvation {

	public static void main(String[] args) {
		
		Object lock = new Object();
		
		Thread lowPriorityThread = new Thread(() -> {
			synchronized (lock) {
				System.out.println("Low Priority Thread Executed");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		Thread highPriorityThread = new Thread(() -> {
			synchronized (lock) {
				System.out.println("High Priority Thread Executed");
			}
		});
		
		highPriorityThread.setPriority(Thread.MAX_PRIORITY);
		lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
		
		lowPriorityThread.start();
		highPriorityThread.start();
	}

}
