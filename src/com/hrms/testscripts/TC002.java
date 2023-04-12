package com.hrms.testscripts;
import com.hrms.lib.General;

import org.testng.annotations.Test;

public class TC002 {
//public static void main(String Args[])throws Exception {
	@Test
	public void tc001() throws Exception{
		//Test step
		General obj = new General ();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj. AddingNewEmpl();
		obj.exitFrame();
		obj.closeApplication();
		}
}



