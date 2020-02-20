package TestNg;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class Junit_testcase {
@Test
     public void testcase1()
     {
	  System.out.println("TEST CASE 1");
     }
@Test
public void testcase2()
{
 System.out.println("TEST CASE 2");
}
@Test
public void testcase3()
{
 System.out.println("TEST CASE 3");
}
@BeforeClass
public static void BeforeClass()
{
	System.out.println("Before Class");
}
@AfterClass
public static void AfterClass()
{
	System.out.println("After class");
}
@Before
public void beforemethod()
{
	System.out.println("Before method");
}
@After
public void aftermethod()
{
	System.out.println("After method");
}
}
