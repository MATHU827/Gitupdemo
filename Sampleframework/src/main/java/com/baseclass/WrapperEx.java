package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperEx {
	protected WebDriver driver;
public void launchApplication(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:/Users/BLTuser.BLT1204/Downloads/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
				driver=new ChromeDriver();

			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		
		} 
		catch (WebDriverException e) {
			System.out.println(" browser could not be launched");
		}
	
	}
public void Takesnap() throws IOException
{

	TakesScreenshot ts =((TakesScreenshot)driver);
	File source= ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("C:\\Users\\BLTuser.BLT1204\\eclipse-workspace\\Sampleframework\\src\\main\\java\\com\\baseclass"));
}

public void quit(){
	
	driver.close();
	
}
}
