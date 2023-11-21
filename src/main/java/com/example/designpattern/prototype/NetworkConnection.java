package com.example.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{

	private String id;
	private String importantData;
	private List<String> domains = new ArrayList<>();
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImportantData() {
		return importantData;
	}
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	
	@Override
	public String toString() {
		return "NetworkConnection [id=" + id + ", importantData=" + importantData + ", domains=" + domains + "]";
	}
	
	public void loadImportantData() {
		this.importantData = "loads very important data";
		
		domains.add("www.123.com");
		domains.add("www.456.com");
		domains.add("www.789.com");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setId(this.getId());
		networkConnection.setId(this.getImportantData());
		for (String d : getDomains()) {
			networkConnection.getDomains().add(d);
		}
		
		return networkConnection;
	}
	
	
}
