package com.kyd.testcases;

import java.awt.Toolkit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.kyd.pages.LoginPage;



public class TestBase {

	protected WebDriver driver;
	private String browsertype="chrome";
	protected LoginPage loginpage;
	private String stagingurl="https://in.knowyourday.ai/";
	private String produrl="https://kyd-single.adappt.co.uk/";
	
	
	
	
	@BeforeClass
	public void setup() {
		switch(browsertype) 
		{
		case "chrome":
//			ChromeOptions chrome_Profile = new ChromeOptions();
//			chrome_Profile.addArguments("chrome.switches","--disable-extensions"); 
//			chrome_Profile.addArguments("--disable-save-password");
//			chrome_Profile.addArguments("disable-infobars");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala\\Downloads\\chromedriver_2.37\\chromedriver2.37.exe");
		    driver = new ChromeDriver();
			System.out.println("Chrome browser is launched");
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bala\\Downloads\\geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("Firefox browser is launched");
			break;
			
		case "IE":
			System.setProperty("webdriver.IE.driver", "C:\\Users\\Bala\\Downloads\\geckodriver.exe");
			driver=new InternetExplorerDriver();
			System.out.println("IE browser is launched");
			break;
		}
		driver.get(stagingurl);
		System.out.println("URL has passed");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
    	Dimension screenResolution = new Dimension((int) 
    	                    toolkit.getScreenSize().getWidth(), (int) 
    	                    toolkit.getScreenSize().getHeight());
    	driver.manage().window().setSize(screenResolution);
    	loginpage=PageFactory.initElements(driver, LoginPage.class);
    	
	}
	
	@AfterClass
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	}

