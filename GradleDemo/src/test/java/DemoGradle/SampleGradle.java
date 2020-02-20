package DemoGradle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleGradle {
	@Test
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
			
		
		 driver.get("https://www.linkedin.com/");
	}

}
