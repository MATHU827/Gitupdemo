package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Alaska_pages {
	WebDriver driver;
   //Mapping to locators 
	By whale=By.partialLinkText("whale watching tour");
	By menu =By.className("headerMainToolbar__menuButtonImage");
	By plan_Cruise=By.linkText("Plan A Cruise");
	By closemenu =By.className("headerSidenav__buttonImage");
	By ships= By.linkText("SHIPS");
	By rhapsoday=By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[6]/div/section/div/div[16]/a/div");
	By deck =By.linkText("DECK PLANS");
	By dropdown= By.id("deckDropdown");
	By royal=By.xpath("//*[@id=\"deck-plans-template\"]/section/section[2]/section[1]/div[2]/section[5]/h4");
	
	public Alaska_pages(WebDriver driver)
	{
		this.driver=driver;
	}
	//  Check for the presence of "whale watching" link on the page
	public int whalelink()
	{
		List<WebElement> a=driver.findElements(whale);
		 int link=a.size();
		 System.out.println("Presence of whale link" +link);
		 return link;
		}
	 // Click on "Plan a Cruise"
	public void PlanCruise() throws InterruptedException
	{
		driver.findElement(menu).click();
		driver.findElement(plan_Cruise).click();
		driver.findElement(closemenu).click();
	}
	//Go by "Search By Ship"
	public void ship() throws Throwable
	{
		driver.findElement(ships).click();
		Thread.sleep(2000);
	}
	//Choose "Rhapsody of the Seas"
	public void Rhapsody()
	{
		driver.findElement(rhapsoday).click();
	}
	// Click on Deck Plans
	public void Deck_plan() throws Throwable
	{
		driver.findElement(deck).click();
		Thread.sleep(3000);
     //Change to "Deck Eight
		Select drop = new Select(driver.findElement(dropdown));
		drop.selectByValue("BR");
		Thread.sleep(3000);
	}
	public String royal_blue() {
		//Check the presence of "Royal Suite"
        String royal1=driver.findElement(royal).getText();
		String royal2=royal1.substring(0,12);
		 System.out.println("Checking Presence of Royal Suite 	:"+royal2);	
		return	royal2; 
	
	}
}
