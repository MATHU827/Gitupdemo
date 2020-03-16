package com.Testcase;

import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Baseclass.Wrapper_class;
import com.Pages.Alaska_pages;


public class Alaska_testcase extends Wrapper_class{
	@Test
	// Calling of methods
	public void call() throws Throwable
{
		Alaska_pages obj=new Alaska_pages(driver);
		obj.whalelink();
		obj.PlanCruise();
		obj.ship();
		obj.Rhapsody();
		obj.Deck_plan();
		obj.royal_blue();
}
	@Test
	public void royalblue()
	{
		//Assert to Pass if "whale watching" link AND "Royal Suite" are present, else assert fail with the message "Does not meet my requirements"
		Alaska_pages obj=new Alaska_pages(driver);
		
		String c=obj.royal_blue();
		int link=obj.whalelink();
       if(c.equals("Royal Suite")&& link==1) {
			Assert.assertTrue(true);	
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Does not meet the requirement");
		}
	}
	@BeforeMethod
	// Launch the web site
    public void startup()
	{
		launch_application("chrome","https://www.royalcaribbean.com/alaska-cruises" );
	}
	@AfterMethod
	public void close()
	{
		close();
	}
}
