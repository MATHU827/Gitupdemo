package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Feature/Oxford.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc02_Print_email_id"},
		glue = {"steps"},
		monochrome = true
		)

public class Print_runner {
	
}