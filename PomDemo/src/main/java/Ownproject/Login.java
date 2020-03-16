package Ownproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	public void Login() {
		 WebDriver driver;
		 By Loginbutton=By.id("");
		 By username=By.id("");
		 By password = By.id("");
		 By signinbutton=By.xpath("");
		 public Login(WebDriver driver);
		 {
			 this.driver=driver;
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

		 }
	}
