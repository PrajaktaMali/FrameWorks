package com.hrms.testscripts;
import com.hrms.lib.General;

public class TC003_EditingEmpl {
	public static void main(String args[]) {
		//TEST STEPS
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.clickingEmplName();
		obj.EditingEmpl();
		obj.logout();
		obj.closeApplication();
		}

}
