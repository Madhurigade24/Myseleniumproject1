package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	WebDriver driver;

	public WebDriver initializeDriver(String Browser)
	{
		if(Browser =="Chrome")
		{
	System.out.println("Launching URL");
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Rohan\\Desktop\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.name("Input Form Demo")).click();
		}
		return driver;
	}

}
