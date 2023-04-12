package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global{
	//TO PROVIDE REUSABLE function
	public void openApplication() {
		System.setProperty("WebDriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened"); //console
		Reporter.log("Application Opened"); //html report
		Log.info("Application opened"); //Logfile
		}
	public void login() {
		driver.findElement(By.name(txt_username)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login successfull");
		Log.info("Login completed");
	}
	public void logout() {
		driver.findElement(By.xpath(link_logout)).click();
		System.out.println("logout completed");
		Log.info("Logout completed");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		Log.info("Application closed");
	}
	public void gettitle1() {
		if (driver.getTitle().equals(title1)) {
		System.out.println("Title matched");
		}
		else {
			System.out.println(driver.getTitle());
		}
	}
	public void gettitle2() {
		if  (driver.getTitle().equals(title2)) {
		System.out.println("title mathced");
		}
		else {
			System.out.println(driver.getTitle());
		}
	}
	public void performMouseOver() {
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText(link_PIM))).perform();
		System.out.println("clicked on submenu");
		driver.findElement(By.linkText(btn_AddEmpl));
		System.out.println("mouseover performed");
		}
	public void AddingNewEmpl() {
		driver.findElement(By.xpath(btn_ADD)).click();
		driver.findElement(By.name(FirstName)).sendKeys("selenium");
		driver.findElement(By.name(LastName)).sendKeys("Prajakta");
		driver.findElement(By.id(btn_Save)).click();
		System.out.println("new Emp Added");
		Log.info("new Emp Added");
	}
    public void clickingEmplName() {
    	Select st = new Select(driver.findElement(By.name(SearchBy)));
    	st.selectByVisibleText(Select_EmplID);
    	driver.findElement(By.name(SearchFor)).sendKeys(AnyID);
    	driver.findElement(By.xpath(btn_Search)).click();
    	driver.findElement(By.name(EmplID_CheckBox)).click();
    	driver.findElement(By.linkText(EmplyName)).click();
    	System.out.println("clicked on Empl ID");
       }
    public void EditingEmpl() {
    	driver.findElement(By.name(btn_Edit)).click();
    	driver.findElement(By.name(txt_FirstName )).clear();
    	driver.findElement(By.name(txt_lastName)).clear();
    	driver.findElement(By.name(txt_FirstName)).sendKeys(new_FirstName);
    	driver.findElement(By.name(txt_lastName)).sendKeys(new_LastName);
    	driver.findElement(By.name(btn_Save)).click();
    	System.out.println("empl successfully edited");
    	 }
    public void enterFrame() {
    	driver.switchTo().frame("rightMenu");
    	System.out.println("Entered into frame");
    	Log.info("Enter frame");
    }
    public void exitFrame() {
    	driver.switchTo().defaultContent();
    	System.out.println("Exit from frame");
    	Log.info("exit frame");
    }
    
    public void DeletingEmpl() {
    	driver.findElement(By.xpath(btn_Delete)).click();
    	System.out.println("empl deleted");
    }
}
