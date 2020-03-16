package Main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Download_main {
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
    public void journalAtoZ() 
	{
      driver.findElement(By.linkText("Journals A to Z")).click();
	}

	public void dispatch_date() 
	{
	  driver.findElement(By.xpath("//*[@id=\"cloudCMS\"]/div/div[2]/div[2]/ul/li[2]/a")).click();
	}
	public void Select_journal() 
	{
	  driver.findElement(By.xpath("//*[@id=\"id_pick_journal\"]")).click();	
	  Actions action = new Actions(driver);
	  action.sendKeys(Keys.DOWN);
	  action.sendKeys(Keys.DOWN).click().build().perform();
	  
//	  driver.findElement(By.xpath("//*[@id=\"id_pick_journal\"]")).sendKeys(Keys.DOWN);
//	  driver.findElement(By.xpath("//*[@id=\"id_pick_journal\"]")).sendKeys(Keys.DOWN);
//	  driver.findElement(By.xpath("//*[@id=\"id_pick_journal\"]")).sendKeys(Keys.ENTER);
    }
	public void file_download()
	{
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
	}
	public void close_page() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
