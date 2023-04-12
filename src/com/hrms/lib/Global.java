package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	//PROVIDING TEST DATA & OBEJECTS/ELEMENTS
	//*****************************TEST DATA
	public String url= "http://183.82.103.245/nareshit/login.php";
	public String username = "nareshit";
	public String password = "nareshit";
	public String title1 = "OrangeHRM - New Level of HR Management" ;
	public String title2 = "OrangeHRM";
	public String FirstName = "txtEmpFirstName";
	public String LastName = "txtEmpLastName";
	public String SearchBy = "loc_code";
	public String SearchFor = "loc_name";
	public String AnyID = "1203";
	public String EmplyName = "selenium  suresh";
	public String txt_FirstName = "txtEmpFirstName";
	public String txt_lastName ="txtEmpLastName";
	public String new_FirstName = "selenium";
	public String new_LastName = "Prajakta";
	
	//*****************************objects/elements::
	public String txt_username = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "//a[normalize-space()='Logout']";
	public String link_PIM = "PIM";
	public String btn_AddEmpl = "Add Employee";
	public String btn_Save = "btnEdit";
	public String btn_ADD = "//input[@value='Add'][@type='button']";
	public String btn_Search = "//*[@id=\"standardView\"]/div[2]/input[2]";
	public String btn_Reset = "button";
	public String Select_EmplID = "Emp.ID";
	public String btn_Edit = "EditMain";
	public String EmplID_CheckBox = "chkLocID[]";
	public String btn_Delete = "//*[@id=\"standardView\"]/div[3]/div[1]/input[2]";
	
	}
