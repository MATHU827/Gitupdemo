package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	@Test
//public void main(String[]args) throws InterruptedException 
	public void upload() throws InterruptedException
 {
	 
	 
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
		 driver.get("http://www.tinyupload.com/");
		 driver.manage().window().maximize();
		driver.findElement(By.name("uploaded_file")).sendKeys("C:\\Users\\BLTuser.BLT1204\\Downloads\\Payslip_844547_CIN_Jan_2020.pdf");
		 driver.findElement(By.name("file_description")).sendKeys("Excel");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/img")).click();
		 

   }
   
}