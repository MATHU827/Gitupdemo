package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wrapperclass {
	protected WebDriver driver;

	public void launch_application(String browser, String url) 
	{
		try {
		if(browser.equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\BLTuser.BLT1204\\eclipse-workspace\\Alaska\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
		} 
		catch (WebDriverException e) 
		{
			System.out.println("The browser cannot be launched");
		}
		
	}

	public void close() {
		driver.close();
	}
}
