package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Search {
	WebDriver driver;
	By search=By.id("twotabssearchtextbox");
	By Element1=By.linkText("mobiles under 8000");
	public void Login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void search_item(String data)
	{
		driver.findElement(search).sendKeys(data);
	}
	public void Moment()
	{
		WebElement a=driver.findElement(Element1);
		Actions act = new Actions(driver);
		act.moveToElement(a).click().perform();
	}
}



































