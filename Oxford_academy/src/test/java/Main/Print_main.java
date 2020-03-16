package Main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Print_main {
WebDriver driver;
	
	public void url1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	public void Oxford_website() throws InterruptedException
	{
	  driver.get("https://academic.oup.com/journals");
	  //(enter details)sign in button
	  driver.findElement(By.xpath("//*[@id=\"header-account-info-user-fullname\"]")).click();
	  //user id
	  driver.findElement(By.xpath("//*[@id=\"user_LoginFormPopup\"]")).sendKeys("mahalakshmi.c98@gmail.com");
	  //password
	  driver.findElement(By.xpath("//*[@id=\"pass_LoginFormPopup\"]")).sendKeys("Maha@12345");
	  //sign in
	  driver.findElement(By.xpath("//*[@id=\"pass_LoginFormPopup\"]")).sendKeys(Keys.TAB);
	  driver.findElement(By.xpath("//*[@id=\"pass_LoginFormPopup\"]")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	}
	public void email_id() 
	{
//		WebElement a = driver.findElement(By.linkText("mahalakshmi.c98@gmail.com"));
//		WebElement b = driver.findElement(By.linkText("Edit Personal Details"));
//		Actions action = new Actions(driver);
//		action.moveToElement(a);
//		action.moveToElement(b).click().build().perform();
		driver.findElement(By.xpath("//*[@id=\"header-account-info-user-fullname\"]")).click();
		driver.findElement(By.linkText("Edit Personal Details")).click();
		String S = driver.findElement(By.xpath("//*[@id=\"LastName\"]")).getText();
     	System.out.println(S);
	}
	
}
