package Step_definition;

import Main.Download_main;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Download_steps {
	Download_main a = new Download_main();
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() throws Throwable {
	   a.url1();
	}

	@When("^user opens the oxford website$")
	public void user_opens_the_oxford_website() throws Throwable {
	    a.Oxford_website();
	}

	@When("^click the journalAtoZ button$")
	public void click_the_journalAtoZ_button() throws Throwable {
	   a.journalAtoZ();
	}

	@Then("^click dispatch date button$")
	public void click_dispatch_date_button() throws Throwable {
	   a.dispatch_date();
	}

	@Then("^select a journal$")
	public void select_a_journal() throws Throwable {
	    a.Select_journal();
	}

	@Then("^download the adaptation file$")
	public void download_the_adaptation_file() throws Throwable {
	   a.file_download();
	}

	@Then("^close the page$")
	public void close_the_page() throws Throwable {
	    a.close_page();
	}


}
