package com.Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_of_Mobiles {
	WebDriver driver;
	
	public void Launching_chrome() { 
		System.setProperty("webdriver.chrome.driver","src//test//resources//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public void Product_store() 
	{
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());
		
	}
	public void Elementscount() throws InterruptedException
	{
		Thread.sleep(3000);
		List<WebElement> allElements = driver.findElements(By.xpath("//*"));
		int elementscount = allElements.size();
		System.out.println("Total number of elements in webpage =" + elementscount);
	}
	public void Close()
	{
		driver.close();
	}

	}
