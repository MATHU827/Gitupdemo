package steps;

import Main_java.Linkedin_java;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Linkdin_steps {
	Linkedin_java lj=new Linkedin_java();
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() throws Throwable {
	    lj.launchUrl();
	   // throw new PendingException();
	}

	@When("^the user opens Linkedin homepage$")
	public void the_user_opens_Linkedin_homepage() throws Throwable {
	    lj.homepage();
	    //throw new PendingException();
	}

	@When("^clicks signin$")
	public void clicks_signin() throws Throwable {
	    lj. join() ;
	    //throw new PendingException();
	}

	@Then("^the user should navigate to join page$")
	public void the_user_should_navigate_to_join_page() throws Throwable {
	   lj.tutorial();
	    //throw new PendingException();
	}


}
