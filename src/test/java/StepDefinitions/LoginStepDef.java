package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegistrationPage;
import pageObjects.signinPage;
import utilities.DriverFactory;

public class LoginStepDef extends DriverFactory {
	
	WebDriver driver;
	signinPage sp;
	RegistrationPage rp;
	
	
	public LoginStepDef() {
		setWebDriver();
		this.driver = getDriver();
		sp = new signinPage(driver);
		rp = new RegistrationPage(driver);
	}	
	
	
	
	@Given("User clicks the Signin link")
	public void user_clicks_the_signin_link() {
		rp.openDsPortal();
		rp.clickGetStarted();
	    sp.signLink();
	    
		
	}


	@When("user gives correct \"(.*)\" and \"(.*)\"$")
	public void user_gives_correct_and(String username, String password) {
		sp.loginCredentials(username, password);
	
	}
    


	@And("clicks the login button")
	public void clicks_the_login_button() {
	    sp.clickLoginBtn();
	}

	@Then("The user should be redirected to Homepage with the text displayed as You are logged in")
	public void the_user_should_be_redirected_to_homepage_with_the_text_displayed_as_you_are_logged_in() {
	    sp.valloggedinpage();
	}

	
}
