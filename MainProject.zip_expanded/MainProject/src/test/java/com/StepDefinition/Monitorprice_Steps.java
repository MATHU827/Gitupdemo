package com.StepDefinition;



import com.Pages.Monitor_Price;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Monitorprice_Steps {
	public class Printprice_steps {
		Monitor_Price monitorprice= new Monitor_Price();

		@Given("^open the chrome page$")
		public void launching_chrome() {
			monitorprice.launching_chrome();
		}

		@When("^user Opens demo app$")
		public void product_store()  {
			monitorprice.product_store();
		  
		}

		@Then("^The user clicks monitors$")
		public void Click_monitor() throws InterruptedException  {
			monitorprice.Click_monitor();

		}

		@Then("^click apple monitor and print price$")
		public void printprice() throws InterruptedException {
			monitorprice.printprice();
		  
		}

		@And("^close app$")
		public void close()  {
			monitorprice.close();
		   
		}

		}


}
