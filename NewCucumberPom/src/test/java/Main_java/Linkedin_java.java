package Main_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin_java {
	WebDriver driver;
	WebElement Signin;

	public void launchUrl() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void homepage() {
		driver.get("https://www.linkedin.com/");

	}

	public void join() {
		Signin = driver.findElement(By.xpath("/html/body/nav/a[3]"));
		Signin.click();
		 driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Mathumitha");
		    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		    driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[4]/button")).click();
		System.out.println("Sign in sucessful");
	}

	public void tutorial() throws InterruptedException {
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
	}
}





