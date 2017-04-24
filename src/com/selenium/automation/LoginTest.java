package com.selenium.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver =null;
	
	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:/devwork/chromedriver.exe");
	}
	
	@Test
	public void test(){
		driver = new ChromeDriver();
		driver.get("http://google.com");
		String s = driver.getTitle();
		Assert.assertEquals(s, "Google");
	}
	
	@AfterTest
	public void cleanup(){
		if(driver!= null){
			driver.quit();
		}
	}
	

}
