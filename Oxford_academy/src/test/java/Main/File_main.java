package Main;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class File_main {
WebDriver driver;
	
	public void url1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
}
	public void Oxford_website()
	{
	  driver.get("https://academic.oup.com/journals");
	
	}
	public void title_check()
	{
		String a = driver.findElement(By.xpath("//*[@id=\"LastName\"]")).getText();
		System.out.println(a);
		String b = "mahalakshmi.c98@gmail.com";
	    Assert.assertEquals(b, a);
	}
}