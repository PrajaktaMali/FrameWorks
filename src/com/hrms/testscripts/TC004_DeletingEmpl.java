package com.hrms.testscripts;
import com.hrms.lib.General;

public class TC004_DeletingEmpl {
	public static void main(String args[]) {
		//test steps
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.clickingEmplName();
		obj.DeletingEmpl();
		obj.logout();
		obj.closeApplication();
	}

}
