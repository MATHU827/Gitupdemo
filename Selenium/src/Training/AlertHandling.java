package Training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.busindia.com/PRTC-Pondicherry-Online-Booking.jsp");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div/div/div/div[1]/div[8]/button")).click();
		 Alert a=driver.switchTo().alert();
		 System.out.println(a.getText());
		 a.accept();//clicking ok button
//		 a.dismiss();//clciking cancel button
//		 a.sendKeys("mathu");//Prompt alert value has to be given
//		 driver.close();
	}

}
