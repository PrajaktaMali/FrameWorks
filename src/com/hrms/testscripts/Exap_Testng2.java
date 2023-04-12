package com.hrms.testscripts;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class Exap_Testng2 {
	@BeforeTest
	public void login() {
		System.out.println("login successful");
	}
	@AfterTest
	public void logout() {
		System.out.println("logout successful");
	}
	@Test(priority=1)
	public void addempl() {
		System.out.println("new empl added");
	}
	@Test(priority=2)
	public void deleteEmpl() {
		System.out.println("empl deleted");
	}

}
