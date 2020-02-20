package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard {
	@Test
public void Key()
{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		 driver.get("https://www.linkedin.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
		 driver.findElement(By.id("username")).sendKeys("mathu");
		// driver.findElement(By.id("password")).sendKeys("12345");
		 Actions action=new Actions(driver);
		 action.sendKeys(Keys.TAB).perform();
		 action.sendKeys("123").perform();
		 action.sendKeys(Keys.RETURN).perform();


}
	}
