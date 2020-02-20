package TestNg;

import org.junit.Assert;
import org.testng.annotations.Test;

public class dependsOnMethod1 {
@Test
public void login() {
	System.out.println("Login the application");
	
}
@Test(dependsOnMethods= {"login"})
public void Open()
{
	System.out.println("Open The application");
}
@Test(dependsOnMethods= {"Open"})
public void search()
{
	System.out.println("Search the application");
	Assert.assertEquals("abc","xyz");
}
@Test(dependsOnMethods= {"search"}, alwaysRun=false)
public void logout()
{
	System.out.println("logout the application");
}

}
