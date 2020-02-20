package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedinLogin {
   WebDriver driver;
   By email=By.id("username");
   By password=By.id("password");
   By SignInBtn=By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
   By signin=By.xpath("/html/body/nav/a[3]");
   public LinkedinLogin(WebDriver driver)
   {
	   this.driver=driver;
   }
   public void signin()
   {
	   driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
   }
   public void loginToApp_email(String emailid)
   {
	   driver.findElement(email).sendKeys(emailid);
   }
   public void loginTo_passwrd(String pass)
   {
	   driver.findElement(password).sendKeys(pass);
   }
   public void Sign_in_btn()
   {
	   driver.findElement(SignInBtn).click();
   }
}
