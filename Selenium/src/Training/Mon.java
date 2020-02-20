package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mon {
	public static void main(String[]args)
	{	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
		
	
	 driver.get("https://www.linkedin.com/");
	 /* driver.findElement(By.className("nav__button-secondary")).click();
	 driver.findElement(By.id("username")).sendKeys("Mathumitha");
	 driver.findElement(By.id("password")).sendKeys("12345");
	 driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click();
     driver.close();*/

	 //driver.findElement(By.linkText("Join now")).click();
	 //driver.findElement(By.partialLinkText("Join")).click();
	 //Relative xpath code
	 driver.findElement(By.xpath("//*[@class='pill pill--talent-finder-cta']")).click();
	 //Relative xpath using AND condition( using 2 locators ie id and type)
	 driver.findElement(By.xpath("//*[@id='first-name-ember18' and @type='text']")).sendKeys("Mathumitha");
	 //Relative xpath for OR condition
	 driver.findElement(By.xpath("//*[@id='last-name-ember18' or @data-test-form-input='lastName']")).sendKeys("Bady");
	 //Relative xpath using CONTAINS
	 driver.findElement(By.xpath("//*[contains(@type,'email')]")).sendKeys("mmmbady");
	 //Relative xpath using Starts with
	 driver.findElement(By.xpath("//*[starts-with(@id,'password-ember18')]")).sendKeys("mathu");
	}
}
