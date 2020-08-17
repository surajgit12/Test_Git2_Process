package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactPage {

	@Test(priority = 0)
	void Contacts_Page() {

		System.out.println("Contacts_Page");
		
		Assert.assertTrue(true);

	}
	
	@Test(priority = 0)
	void Contacts_for_Mailing_Address() {

		System.out.println("Contacts_for_Mailing_Address_Page");
		
		Assert.assertTrue(true);

	}


}
