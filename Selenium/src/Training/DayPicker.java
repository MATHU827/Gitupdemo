package Training;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayPicker {
	public static void main(String[]args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.redbus.in/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@class='db text-trans-uc']")).click();
		 driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[5]")).click();

}
}
