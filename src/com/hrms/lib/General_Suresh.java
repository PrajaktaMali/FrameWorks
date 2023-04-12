package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class General_Suresh extends Global_Suresh {
	//To Provide re-usable fun:/methods related to whole application
	public void openApplication() {
	System.setProperty("WebDriver.gecko.driver", "F:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened");
	}
	public void closeApplication() {
	driver.close();
	System.out.println("Application closed");
	}
	public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login completed");
	}
	public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout completed");
	}
	public void AddEmployee() throws Exception {
		 // mouse over to PIM
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("mouseover completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Clicked on Subemenu");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		Thread.sleep(3000);
		driver.close();
	}
}


	



