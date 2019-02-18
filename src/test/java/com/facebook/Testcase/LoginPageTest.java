package com.facebook.Testcase;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.Qa.testbasedemo.Testbase;
import com.facebook.pages.LoginPage;

public class LoginPageTest extends Testbase {
	
	LoginPage loginpage;
	public LoginPageTest() 
	{
		super();
	}

	@BeforeSuite
	public void setup() 
	{
		initialization();
		loginpage= new LoginPage();
		
	}
	
	@Test
	public void verifyTitle() 
	{
		String title = loginpage.verifyTitle();
		System.out.println("Title is:"+title);
		
		
	}
	@Test
	public void verifyLoginTest() {
		loginpage.verifyLogin();
		
	}
	@AfterSuite
	public void close() {
		driver.quit();
	}
}
