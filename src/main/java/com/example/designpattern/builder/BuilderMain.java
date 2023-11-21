package com.example.designpattern.builder;

import com.example.designpattern.builder.User.UserBuilder;

public class BuilderMain {

	public static void main(String[] args) {
		
		User user = new User.UserBuilder().setUserId("1").setUserName("Vaibhav").setEmailId("vc@gmail.com").build();
		System.out.println(user.toString());
		
		
		User user1 = User.UserBuilder.getuserBuilder().setUserId("2").setUserName("Raghav").setEmailId("rg@gmail.com").build(); 	
		System.out.println(user1.toString());
		
	}

}
