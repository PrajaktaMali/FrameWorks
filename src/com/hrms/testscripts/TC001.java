package com.hrms.testscripts;
import com.hrms.lib.General;

import org.testng.annotations.Test;

public class TC001 {
	//public static void main(String args[]) throws Exception{
	@Test
		public void tc001() throws Exception {
		//TEST STEPS::::::::::::::::
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}

}
