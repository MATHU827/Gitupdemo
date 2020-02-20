package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SampleTestCases {
	
  @Test
  public void testcase1() {
	  System.out.println("Test Case 1");
  }
  @Test
  public void testcase2() {
	  System.out.println("Test Case 2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method:Launch the App");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method:Close the app");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class:  Prepare Test data");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class: Clear test data");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test:Open db connection");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Close Db connection");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite:Smoke Testing");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite :Generate Report");
  }
  

}
