package com.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Pages.Invalid_placeorder;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Invalidplaceorder_Steps {
	Invalid_placeorder invalidorder= new Invalid_placeorder();
		@Given("^user launch chrome$")
		public void user_launch_chrome() {
			invalidorder.launching_chrome();
		   
		}

		@When("^user open demo application$")
		public void user_open_demo_application()  {
			invalidorder.product_store();
		   
		}
		@Then("^Then click cart and place order$")
		public void then_click_cart_and_place_order() throws InterruptedException {
			invalidorder.click_placeorder();
		 
		}

		@Then("^click purchase$")
		public void click_purchase() throws InterruptedException {
			invalidorder.purchase();
		    
		}

		@And("^close the application$")
		public void close_the_application() throws InterruptedException {
			invalidorder.close();
		  
		}


	}
