package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.DsIntroPage;
import pageObjects.QueuePage;
import pageObjects.RegistrationPage;
import pageObjects.signinPage;
import utilities.DriverFactory;

public class QueueStepDef {
	WebDriver driver;
	RegistrationPage rp;
	DsIntroPage dsintro;
	signinPage sp;
	QueuePage qp;

	@Before()
	public void setup() {
		rp = new RegistrationPage(driver);
		dsintro = new DsIntroPage(driver);
		sp = new signinPage(driver);
		qp = new QueuePage(driver);
	}

	public QueueStepDef() {
		this.driver = DriverFactory.getDriver();
	}
	
	@Given("Click the word Queue from dropdown Datastructures")
	public void click_the_word_queue_from_dropdown_datastructures() {
		rp.openDsPortal();
		rp.clickGetStarted();
		sp.signLink();
		sp.loginCredentials("keerv", "Heat6er@123");
	sp.clickLoginBtn();
	qp.clkqueue();
	}

	@When("when user the clicks the Implementation of Queue in Python link")
	public void when_user_the_clicks_the_implementation_of_queue_in_python_link() {
	    qp.firstqueuelink();
	}

	@When("when user the clicks the Implementation using collections.deque link")
	public void when_user_the_clicks_the_implementation_using_collections_deque_link() {
	   qp.secondqueuelink();
	}

	@When("when user the clicks the Implementation using array link")
	public void when_user_the_clicks_the_implementation_using_array_link() {
	   qp.thirdqueuelink();
	}

	@When("when user the clicks the Queue Operations link")
	public void when_user_the_clicks_the_queue_operations_link() {
	    qp.fourthqueuelink();
	}




}
