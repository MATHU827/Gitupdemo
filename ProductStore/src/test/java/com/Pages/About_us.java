package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class About_us {
	WebDriver driver;
	By Aboutus=By.xpath("//*[@id=\"navbarExample\"]//ul//li[3]/a");
	By play=By.xpath("//*[@id=\"example-video\"]//button//span[1]");
	By Max=By.xpath("//*[@id=\"example-video\"]//div[4]//button[4]//span[1]");
	By pic=By.xpath("//*[@id=\"example-video\"]//div[4]//button[3]//span[1]");

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
public void click_aboutus() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(Aboutus).click();
}
public void play_video() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(play).click();
	Thread.sleep(3000);
	driver.findElement(Max).click();
	Thread.sleep(3000);
	driver.findElement(pic).click();
	
	
}
public void close()
{
	driver.close();
}
}

