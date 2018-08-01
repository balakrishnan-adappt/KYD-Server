package com.kyd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.kyd.testcases.TestBase;

public class LoginPage extends TestBase{

	String normalusername="testingadappt007@gmail.com";
	String normaluserpass="12345678";
	String coadminuser="testingadappt@yahoo.com";
	String coadminpass="12345678";
	String superadmin="balakrishnan.r@adappt.co";
	String superadminpass="bala.1221";
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage enter_username(String user) {
		loginpage=new LoginPage(driver);
		PageFactory.initElements(driver, LoginPage.class);
		email_id.sendKeys(user);
		return loginpage;
	}
	
	public LoginPage enter_password(String pass) {
		loginpage=new LoginPage(driver);
		PageFactory.initElements(driver, LoginPage.class);
		password.sendKeys(pass);
		return loginpage;
	}
	
	public LoginPage click_LogIn() {
		loginpage=new LoginPage(driver);
		PageFactory.initElements(driver, LoginPage.class);
		login_button.click();
		return loginpage;
	}
	
	
	public LoginPage verify_userrole() throws InterruptedException {
		loginpage=new LoginPage(driver);
		PageFactory.initElements(driver, LoginPage.class);
		
		switch(userrole) {
		
		case "normal user":
			enter_username(normalusername);
			enter_password(normaluserpass);
			Thread.sleep(3000);
			click_LogIn();
			System.out.println("logged in as normal user");
			break;
		case "company admin":
			enter_username(coadminuser);
			enter_password(coadminpass);
			Thread.sleep(3000);
			click_LogIn();
			System.out.println("logged in as company admin user");
			break;
		case "super admin":
			enter_username(superadmin);
			enter_password(superadminpass);
			Thread.sleep(3000);
			click_LogIn();
			System.out.println("logged in as super admin user");
			break;
		}
		return loginpage;
	}
	
	public LoginPage wait_for() throws InterruptedException {
		loginpage=new LoginPage(driver);
		PageFactory.initElements(driver, LoginPage.class);
		Thread.sleep(3000);
		return loginpage;
	}
}
