package com.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Wrapperclass;
import com.pages.Alaska;

public class cases extends Wrapperclass
{
	@BeforeMethod
	public void startup()
	{
		launch_application("chrome","https://www.royalcaribbean.com/alaska-cruises");
	}
	@Test
	public void whale1() throws Throwable
	{
		Alaska a1=new Alaska(driver);
		a1.whale();
		a1.click();
		a1.ship();
		a1.Rhapsody();
		a1.deck();
	}
{RoyalCaribbean rc =new RoyalCaribbean(driver);
	
	String a=rc.royal();
	//driver.get("https://www.royalcaribbean.com/alaska-cruises");
	

	if(a.equals("Royal Suite")&&b==1) {
		Assert.assertTrue(true);	
	}
	else {
		Assert.assertTrue(false);
	}
	
   @AfterMethod
	public void close1()

	{
		close();
	}
}
