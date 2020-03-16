package TestCase;

import org.testng.annotations.Test;

import Baseclass.Wrapper_Method;
import Pages.Selenium;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class NewTest extends Wrapper_Method {
	Selenium s =new Selenium(driver);
  @Test
  public void f() {
	 s.documentation();
	 s.download();
	 s.grid();
  }
  @BeforeClass
  public void startup() {
	  launchApplication("chrome","https://www.selenium.dev/");
	  
  }

  @AfterClass
  public void close() {
	  {
		  quit();
	  }
  }

}
