package TestCases;

import org.testng.annotations.Test;

import Library.WrapperEx;
import Pages.LinkedinLogin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Linkedin_testcase extends WrapperEx {
  @Test
  public void login()
  {
	  LinkedinLogin lpage=new  LinkedinLogin (driver);
	  lpage.signin();
	  lpage.loginToApp_email("mmmbady");
	  lpage.loginTo_passwrd("123445");
	  lpage.Sign_in_btn();
  }
  @BeforeClass
  public void Startup() {
		  launchApplication("Firefox","https://www.linkedin.com/");
  }

  @AfterClass
  public void close() {
	  quit();
  }

}
