package com.StepDefinition;

import com.Pages.Count_of_Mobiles;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Countofmobiles_Steps {
	Count_of_Mobiles mobiles=new Count_of_Mobiles();

	@Given("^chrome pages $")
	public void Launching_chrome() {
		mobiles.Launching_chrome();
	}

	@When("^demo page$")
	public void Product_store()  {
		mobiles.Product_store();
	  
	}

	@Then("^count element$")
	public void Elementscount() throws InterruptedException  {
		mobiles.Elementscount();

	}
    @Then("^close the chrome$")
	public void Close()  {
		mobiles.Close();
	   
	}
}

