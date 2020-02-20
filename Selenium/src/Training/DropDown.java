package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Select day=new Select(driver.findElement(By.id("day")));
		 day.selectByIndex(8);
		 Select month=new Select(driver.findElement(By.id("month")));
		 month.selectByVisibleText("Apr");
		 Select year=new Select(driver.findElement(By.id("year")));
		 year.selectByValue("1998");
		 driver.findElement(By.xpath("//*[@class='_58mt']")).click();
		 
		 
	}

}
