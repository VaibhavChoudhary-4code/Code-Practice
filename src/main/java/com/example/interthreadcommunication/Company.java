package com.example.interthreadcommunication;

import lombok.Synchronized;

public class Company {

	
	int n;
	boolean flag = false;
	
	synchronized public void produce_item(int n) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("Produced : "+this.n);
		flag = true;
		notify();
	}
	
	synchronized public int consume_item() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Consumed : "+this.n);
		flag = false;
		notify();
		return this.n;
		
	}
	
}
