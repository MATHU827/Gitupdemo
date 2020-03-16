package Main_java;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class main_java {
		WebDriver driver;
		//WebElement a;

		public void url() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			//driver.get("https://google.com");
			//System.out.println(driver.getTitle());

		}
		public void Linkedin_homepage()
		{
			driver.get("https://www.linkedin.com/");
			System.out.println(driver.getTitle());
		}

		public void verify() throws InterruptedException {
			driver.findElement(By.xpath("/html/body/nav/a[2]")).click();
				Thread.sleep(3000);

			}

		public void submit() {
	    driver.findElement(By.xpath("//*[@id=\"email-or-phone\"]")).sendKeys("Mathumitha");
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
	    driver.findElement(By.xpath("//*[@id=\"join-form-submit\"]")).click();
	    driver.close();
		}
	}


