package com.StepDefinition;

import com.Pages.About_us;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Aboutus_steps {
	About_us Ap=new About_us();

	@Given("^Chrome web page$")
	public void launching_chrome() {
	Ap.launching_chrome();
	}

	@When("^DemoWebshop app$")
	public void product_store()  {
	    Ap.product_store();
	  
	}

	@Then("^click aboutus$")
	public void click_aboutus() throws InterruptedException  {
	   Ap.click_aboutus();

	}

	@Then("^play video in full screen$")
	public void play_video() throws InterruptedException {
	   Ap.play_video();
	  
	}

	@And("^Close demo app$")
	public void close()  {
	  Ap.close();
	   
	}

	}
