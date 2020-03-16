package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDown {
	@Test
	//Scroll Down 
	public void scrolldown()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.linkedin.com/");
		 driver.manage().window().maximize();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		// Scroll Down the web page by Pixel
		 js.executeScript("window.scrollBy(0,1000)");
		// WebElement Element=driver.findElement(By.linkText("Post a job"));
		// js.executeScript("arguements[0].scrollIntoView();",Element);
	
	}
	}
		
	
