package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Alaska {
	WebDriver driver;
	public boolean wh=false;
	By whale=By.linkText("whale watching tour");
	By bar=By.xpath("//*[@id=\"rciHeaderOpenSidenav\"]/figure/img");
	By closebar=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[6]/div[1]/div[1]/button/figure/img");
	By plan_a_cruise=By.xpath("//*[@id=\"rciHeaderSideNavMenu-1\"]/span");
	By shipclick=By.linkText("SHIPS");
	By rap=By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[6]/div/section/div/div[16]/a/div/figure/div");
	By plan=By.linkText("DECK PLANS");
	public Alaska(WebDriver driver)
	{
		this.driver=driver;
	}
	public void whale()
	{
		
		List<WebElement>links=driver.findElements(whale);
		 if(links.size()>0)
		 {
			 wh=true;
		 }
	}
	public void click()
	{
		driver.findElement(bar).click();
		driver.findElement(plan_a_cruise).click();
		driver.findElement(closebar).click();
	}
	public void ship() throws InterruptedException
	{
		driver.findElement(shipclick).click();
		Thread.sleep(3000);
	}
	public void Rhapsody() throws InterruptedException
	{
		driver.findElement(rap).click();
		//Thread.sleep(3000);
	}
	public void deck() throws InterruptedException
	{
		 driver.findElement(plan).click();
		 Thread.sleep(3000);
		 //driver.findElement(By.className("deck-dropdown")).click();
		 //Thread.sleep(3000);
		 Select value=new Select(driver.findElement(By.id("deck-dropdown")));
		 value.selectByValue("BR");
//		 value.selectByValue("Deck Eight");
		// Thread.sleep(3000);
		 
		 //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[2]/section/div[1]/label/select")).click();
	}
	public String royal()
	{
		String a= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[2]/section/section[2]/section[1]/div[2]/section[5]/h4")).getText();
		String royal=a.substring(0, 11);
		System.out.println(royal);
		return royal;
	}

}
