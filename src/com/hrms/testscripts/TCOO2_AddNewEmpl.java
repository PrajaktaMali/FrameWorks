package com.hrms.testscripts;
import com.hrms.lib.General;

public class TCOO2_AddNewEmpl {
	public static void main(String args[]) {
		//TEST STEPS::::::::::::::::::::
		General obj = new General();
		obj.openApplication();
		obj.gettitle1();
        obj.login();
        obj.gettitle2();
        obj.performMouseOver();
        obj.AddingNewEmpl();
        obj.exitFrame();
        obj.logout();
        obj.closeApplication();
		}
	

}
