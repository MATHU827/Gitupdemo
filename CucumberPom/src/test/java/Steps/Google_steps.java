package Steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main_java.Google_Java;

public class Google_steps {
	Google_Java google = new Google_Java();

	@Given("^launch an chrome browser$")
	public void launch_an_chrome_browser() {
		google.url();
	}
	@When("^the user opens google homepage$")
	public void the_user_opens_google_homepage() throws InterruptedException {
		google.google_homepage();
	}

	@Then("^verify textbox$")
	public void verify_textbox() throws InterruptedException {
		google.verify();
	}

	@Then("^click the submit button$")
	public void click_the_submit_button() {
		google.submit();

	}

}



