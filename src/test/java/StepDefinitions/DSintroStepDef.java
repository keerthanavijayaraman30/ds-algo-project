package StepDefinitions;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DsIntroPage;
import pageObjects.RegistrationPage;
import pageObjects.signinPage;
import utilities.DriverFactory;

public class DSintroStepDef  {
	
	WebDriver driver;
	RegistrationPage rp;
	DsIntroPage dsintro;
	signinPage sp;
	
	@Before()
	public void setup(){
		
		rp = new RegistrationPage(driver);
		dsintro = new DsIntroPage(driver);
		sp = new signinPage(driver);
	}
	
	public DSintroStepDef() {
		this.driver = DriverFactory.getDriver();
		
	}	
	
	@Given("User clicks the Get Started button")
	public void user_clicks_the_get_started_button() {
		rp.openDsPortal();
		rp.clickGetStarted();
		sp.signLink();
		sp.loginCredentials("keerv", "Heat6er@123");
		sp.clickLoginBtn();
		dsintro.dsgetstartbtn();
	    
	}

	@When("when user the clicks the time complexity link")
	public void when_user_the_clicks_the_time_complexity_link() {
	    dsintro.timecomplexlink();
	}

	@And("user clicks try here>>>")
	public void user_clicks_try_here() {
		dsintro.tryHerebtn();
	    
	}

	@Then("validate the python editor code")
	public void validate_the_python_editor_code() {
		
		dsintro.enterText();
	   
	}

	@And("click the run button and check the output")
	public void click_the_run_button_and_check_the_output() {
									
	    dsintro.runbtn();
	}
	
	
	  @AfterAll() public static void before_or_after_all() {
	  DriverFactory.quitDriver(); }
	 

	
	/*
	 * @After public void tearDown() { DriverFactory.quitDriver(); }
	 */
}
