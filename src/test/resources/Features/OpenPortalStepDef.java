package StepDefinitions;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegistrationPage;
import utilities.DriverFactory;

public class OpenPortalStepDef extends DriverFactory {
	WebDriver driver;
	RegistrationPage rp;
	
	public OpenPortalStepDef() {
		setWebDriver();
		this.driver = getDriver();
		 rp = new RegistrationPage(driver);
		 
		 
	}

@Given("The user opens DS Algo portal link")
public void the_user_opens_ds_algo_portal_link() {
    rp.openDsPortal();
}

@When("User clicks the get started button")
public void user_clicks_the_get_started_button() {
    rp.clickGetStarted();
}

@Then("Validate Data structures link is displayed")
public void validate_data_structures_link_is_displayed() {
	rp.valDSLink();
	
}




}
