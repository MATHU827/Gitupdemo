package Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
public static void main(String args[])
{
	System.setProperty("webdriver.ie.driver","C:/Users/BLTuser.BLT1204/Downloads/IEDriverServer.exe");
	 WebDriver driver = new InternetExplorerDriver();
	 driver.get("https://www.facebook.com/");
}
}
