package com.kyd.testcases;

import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{

	@Test
	public void login() throws InterruptedException {
		loginpage.verify_userrole();
	}

}