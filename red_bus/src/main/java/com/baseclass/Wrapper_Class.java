package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wrapper_Class {
protected WebDriver driver;

public void launch(String browser ,String url)
{
	try
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:/Users/BLTuser.BLT1204/Downloads/geckodriver.exe");
		driver = new FirefoxDriver();		
		}
		else if(browser.equalsIgnoreCase("chrome driver"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
	}
	catch(WebDriverException e)
	{
		
		System.out.println("browser could not be launched");
	}
	public void takesnap()
	{
		
	}
}

}
