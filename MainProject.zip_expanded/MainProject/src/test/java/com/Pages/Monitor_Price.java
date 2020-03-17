package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monitor_Price {
		WebDriver driver;
		By Monitors=By.xpath("//html//body//div[5]//div//div[1]//div//a[4]"); //click monitors in categories
		By Applemonitors=By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"); //click applemonitor

	public void launching_chrome() { 
		System.setProperty("webdriver.chrome.driver","src//test//resources//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public void product_store() 
	{
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());
		
	}
	public void Click_monitor() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(Monitors).click();
		Thread.sleep(3000);
	}
	public void printprice() throws InterruptedException
	{
		
		
		driver.findElement(Applemonitors).click();
		Thread.sleep(3000);
		String s1=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/h3")).getText();
		System.out.println(s1);
		
	}
	public void close()
	{
		driver.close();
	}
	}
