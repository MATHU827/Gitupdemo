package com.TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/Demoblaze.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
//		tags = {"@Tc01_SignUp,@Tc02_Login,@Tc03_Add_to_cart,@Tc04_Contact,@Tc05_clickproduct,@Tc06_DeleteCart,@Tc07_SelectLaptop,@Tc08_To_check_phone_number,@Tc09_To_get_description,@Tc10_To_add_two_product,@Tc11_aboutus,@Tc12_Valid_PlaceOrder,@Tc13_placeorder_alerthandling,@Tc14_To_get_monitor_price,@Tc15-Count_of_mobiles"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)
public class Signup_runner {

}
