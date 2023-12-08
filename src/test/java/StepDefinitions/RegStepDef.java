package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegistrationPage;
import utilities.DriverFactory;

public class RegStepDef extends DriverFactory {

	WebDriver driver;
	RegistrationPage rp;

	public RegStepDef() {
		setWebDriver();
		this.driver = getDriver();
		rp = new RegistrationPage(driver);
	}

	@Given("User clicks the register link")
	public void user_clicks_the_register_link() {
		rp.openDsPortal();
		rp.clickGetStarted();
		rp.regLink();
	}

	@When("user provides correct \"(.*)\" and \"(.*)\"$")
	public void user_gives_correct(String username, String password) {
		rp.credentials(username, password);
	}

	@And("clicks the register button")
	public void clicks_the_register_button() {
		rp.clickRegisterBtn();
	}

	@Then("The user should be redirected to Homepage with the message New Account Created. You are logged in with your username")
	public void the_user_should_be_redirected_to_homepage_with_the_message_new_account_created_you_are_logged_in_with_your_username() {
		rp.valRegPage();
	}

	
	// @After() 
	// public void tearDown() 
	 //{
		// quitDriver(); 
	// }
	
}
