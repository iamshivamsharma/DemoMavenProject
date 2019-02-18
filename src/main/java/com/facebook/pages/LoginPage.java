package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Qa.testbasedemo.Testbase;

public class LoginPage extends Testbase {
	
	
	@FindBy(id="email")
	WebElement userEmail;
	
	@FindBy(id="pass")
	WebElement userPass;
	
	@FindBy(id="loginbutton")
	WebElement loginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyTitle() {
		return driver.getTitle();
		
	}
	
	public void verifyLogin() {
	userEmail.sendKeys(prop.getProperty("username"));
	userPass.sendKeys(prop.getProperty("password"));
	loginButton.click();
	driver.navigate().back();
	
	}
	

}
