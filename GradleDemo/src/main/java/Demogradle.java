import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demogradle {
	@Test
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/draggable/");
		 driver.manage().window().maximize();
	}

}
