package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Feature/Oxford.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc01_File_download"},
		glue = {"steps"},
		monochrome = true
		)
public class Download_runner {

}
