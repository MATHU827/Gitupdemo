package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Headless_Browser {
	@Test
	public void login()
	{
		WebDriver driver=new HtmlUnitDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
		 //WebDriver driver1 = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 System.out.println(driver.getTitle());
	}

}
