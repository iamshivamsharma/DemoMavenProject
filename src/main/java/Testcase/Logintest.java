package Testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import Driver.Driver;

public class Logintest extends Driver {
	@Test
	public void checklogin() {
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.id("loginbutton")).click();
		
	}
	

}
