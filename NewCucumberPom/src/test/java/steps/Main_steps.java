package steps;

import Main_java.main_java;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Main_steps {
	main_java mj= new main_java();
	@Given("^launch an chrome browser$")
	public void launch_an_chrome_browser() throws Throwable {
	    mj.url();
	    //throw new PendingException();
	}

	@When("^the user opens google homepage$")
	public void the_user_opens_google_homepage() throws Throwable {
	    mj.Linkedin_homepage();
	    //throw new PendingException();
	}

	@Then("^user opens linkedin page$")
	public void user_opens_linkedin_page() throws Throwable {
	    mj.verify();
	    //throw new PendingException();
	}

	@Then("^clicks Join send keys")
	public void clicks_Join() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		mj.submit();
	}

//	@Then("^passes send keys$")
//	public void passes_send_keys() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}



}
