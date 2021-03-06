package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/ProductStore.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@Tc06_DeleteCart"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)
public class DeleteCart_runner {

}
