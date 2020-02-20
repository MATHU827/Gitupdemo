package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandling {
	@Test
public void Irtclogin()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	 driver.get("https://www.irctc.co.in/nget/train-search");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[5]")).click();
	 Set<String>winHandles=driver.getWindowHandles();
	 System.out.println("the number of window handles are"+winHandles.size());
	 for(String winHandle:winHandles) {
		 driver.switchTo().window(winHandle);
}
  String tittle=driver.getTitle();
System.out.println("The  page title is"+tittle);
driver.quit();
} 
}
