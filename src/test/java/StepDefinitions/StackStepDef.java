package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.DsIntroPage;
import pageObjects.RegistrationPage;
import pageObjects.StackPage;
import pageObjects.signinPage;
import utilities.DriverFactory;

public class StackStepDef {

	WebDriver driver;
	RegistrationPage rp;
	DsIntroPage dsintro;
	signinPage sp;
	StackPage st;

	@Before()
	public void setup() {
		rp = new RegistrationPage(driver);
		dsintro = new DsIntroPage(driver);
		sp = new signinPage(driver);
		st = new StackPage(driver);
	}

	public StackStepDef() {
		this.driver = DriverFactory.getDriver();
	}

	@Given("Click the word stack from dropdown Datastructures")
	public void click_the_word_stack_from_dropdown_datastructures() {
		rp.openDsPortal();
		rp.clickGetStarted();
		sp.signLink();
		sp.loginCredentials("keerv", "Heat6er@123");
	sp.clickLoginBtn();
		st.clkstack();

	}

	@When("when user the clicks the operations in stack link")
	public void when_user_the_clicks_the_operations_in_stack_link() {
		st.firstlink();

	}

	@When("when user the clicks the implementation link")
	public void when_user_the_clicks_the_implementation_link() {
		st.secondlink();
		st.tryHerebtn();
		st.enterText();
		st.runbtn();

	}

	@When("when user the clicks the applications link")
	public void when_user_the_clicks_the_applications_link() {
		st.thirdlink();
		st.tryHerebtn();
		st.enterText();
		st.runbtn();

	}
	
	  @AfterAll() public static void before_or_after_all() {
	  DriverFactory.quitDriver(); }
	 

	
	/*
	 * @After public void tearDown() { DriverFactory.quitDriver(); }
	 */
	 
}
