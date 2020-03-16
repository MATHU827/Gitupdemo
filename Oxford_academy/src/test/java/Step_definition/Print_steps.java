package Step_definition;

import Main.Print_main;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Print_steps {
	 Print_main p = new  Print_main();
	
	@Given("^user launch the chrome browser$")
	public void user_launch_the_chrome_browser() throws Throwable 
	{
	  p.url1();
	}

	@When("^user opens oxford website$")
	public void user_opens_oxford_website() throws Throwable
	{
		p.Oxford_website();
	}

	@Then("^print the user email id$")
	public void print_the_user_email_id() throws Throwable
	{
	    p.email_id();
	}



}


