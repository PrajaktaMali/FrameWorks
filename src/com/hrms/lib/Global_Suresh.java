package com.hrms.lib;
import org.openqa.selenium.WebDriver;


public class Global_Suresh {
	public    WebDriver driver;
	//To provide TestData & Objects Related to whole application
	//**************TestData
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un  = "nareshit";
	public String pw  = "nareshit";
	//**************Objects/Elements
	public String txt_loginname = "txtUserName";
	public String txt_password  = "txtPassword";
	public String btn_login     = "Submit";
	public String link_logout   = "Logout";

	}

