package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selenium {
		 WebDriver driver;
	         By download=By.className("nav-item");
			 By documentation=By.xpath("/html/body/div[1]/div[2]/p[2]/a");
			 By grid = By.xpath("//*[@id=\"sidebar\"]/div[2]/ul/li[9]/ul/li[4]/a");

			 public Selenium(WebDriver driver)
			 {
				 this.driver=driver;
			 }
				 public void download()
				   {
					   driver.findElement(download).click();
				   }
				   public void documentation()
				   {
					   driver.findElement(documentation).click();;
				   }
				   public void grid()
				   {
					   driver.findElement(grid).click();
				   }
	}
