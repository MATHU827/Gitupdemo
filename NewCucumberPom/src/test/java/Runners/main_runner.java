package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/New.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc02_Google"},
		glue = {"steps"},
		monochrome = true
		)

public class main_runner {

}
