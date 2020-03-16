package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1204\\Downloads\\driver\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
			 driver.get("http://demo.guru99.com/test/web-table-element.php");
			 driver.manage().window().maximize();
			 	List col=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
			 //
			 System.out.println("NO OF COL"+col.size());
			 List row=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
			 System.out.println("No of row"+row.size());

	}

}
