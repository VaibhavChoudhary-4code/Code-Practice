package com.example.designpattern.prototype;

public class PrototypeMain {

	public static void main(String[] args) {
		
		NetworkConnection networkConnection = new NetworkConnection();
		
		networkConnection.setId("1");
		networkConnection.loadImportantData();
		
		System.out.println(networkConnection.toString());
		
		try {
			NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();
			NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
			
			networkConnection.getDomains().remove(0);
			
			System.out.println(networkConnection.toString());
			System.out.println(networkConnection1.toString());
			System.out.println(networkConnection2.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
