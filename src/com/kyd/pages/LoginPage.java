package com.kyd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.kyd.testcases.TestBase;

public class LoginPage extends TestBase{

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public LoginPage verify_login() {
		loginpage=new LoginPage(driver);
		PageFactory.initElements(driver, LoginPage.class);
		System.out.println("successfully configured");
		return loginpage;
		
	}
}
