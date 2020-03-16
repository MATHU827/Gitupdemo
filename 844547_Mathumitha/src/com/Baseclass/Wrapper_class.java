package com.Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wrapper_class {
	protected WebDriver driver;
//Launch of browser
	public void launch_application(String browser, String url) 
	{
		try {
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\BLTuser.BLT1204\\eclipse-workspace\\Alaska\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
//To maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//To get the url 
		driver.get(url);
		
		} 
		catch (WebDriverException e) 
		{
			System.out.println("The browser cannot be launched");
		}
		
	}
//close of browser
	public void close() {
		driver.close();
	}
}
