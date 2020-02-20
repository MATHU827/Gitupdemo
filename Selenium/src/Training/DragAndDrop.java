package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 driver.manage().window().maximize();
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 WebElement a= driver.findElement(By.id("draggable"));
		// driver.switchTo().defaultContent();
		 //driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
		 WebElement b= driver.findElement(By.id("droppable"));
		 Actions actions=new Actions(driver);
		 actions.dragAndDrop(a,b).build().perform();
	}
	}
