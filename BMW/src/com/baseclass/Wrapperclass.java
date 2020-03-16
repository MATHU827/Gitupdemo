package com.baseclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wrapperclass {
	protected WebDriver driver;
	public void launchApplication(String browser, String url) {
			try {
				
					System.setProperty("webdriver.chrome.driver","/src/driver/chromedriver.exe");
					driver=new ChromeDriver();

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
//
//		TakesScreenshot ts =((TakesScreenshot)driver);
//		File source= ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(source, new File("C:\\Users\\BLTuser.BLT1204\\eclipse-workspace\\Sampleframework\\src\\main\\java\\com\\baseclass"));
	}

	public void quit(){
		
		driver.close();
		
	}
	}
