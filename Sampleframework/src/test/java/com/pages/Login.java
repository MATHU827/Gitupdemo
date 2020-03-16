package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	 WebDriver driver;
         By Loginbutton=By.id("");
		 By username=By.id("");
		 By password = By.id("");
		 By Next = By.id("");
		 By signinbutton=By.xpath("");

		 public Login(WebDriver driver)
		 {
			 this.driver=driver;
		 }
			 public void LoginToAmazon_Loginbutton()
			   {
				   driver.findElement(Loginbutton).click();
			   }
			   public void LoginToAmazon_username()
			   {
				   driver.findElement(username);
			   }
			   public void LoginToAmazon_continue()
			   {
				   driver.findElement(Next);
			   }
			   public void LoginToAmazon_password()
			   {
				   driver.findElement(password);
			   }
			   public void LoginToAmazon_signinbutton()
			   {
				   driver.findElement(signinbutton).click();
			   }
			

		 
	

}



