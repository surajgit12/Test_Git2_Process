package com.qa.tests;

import org.testng.annotations.Test;

public class Verify_Login {
	
	
	@Test(priority =0)
	void login_Page() {
		
		System.out.println("Login Page");
		
	}

	@Test(priority =-999)
	void Home_Page() {
		
		System.out.println("Home Page");
		
	}
	
	
	@Test(priority =-1111)
	void New_Home_Page() {
		
		System.out.println("New Home Page");
		
	}
}
