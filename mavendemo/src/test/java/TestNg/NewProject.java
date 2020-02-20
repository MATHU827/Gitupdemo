package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewProject {
	WebDriver driver ;
  @Test
  public void Login() {
	  driver.findElement(By.className("nav__button-tertiary")).click();
	  driver.findElement(By.id("email-or-phone")).sendKeys("mmmbady@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("123456");
  }
  @Test
  public void screenshot() throws IOException {
	  TakesScreenshot ts =(TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("C:\\Users\\BLTuser.BLT1204\\eclipse-workspace\\Selenium\\Screenshot\\linkedin1.png"));
  }
//  @Test
//  public void Lastname() {
//  }
//  
  
  @BeforeMethod
  public void beforeMethod() {
	 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.get("https://www.linkedin.com/");
  }

  @AfterMethod
  public void afterMethod() {
	 driver.close();
  }

}
