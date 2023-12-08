package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By startbtn = By.xpath("//html/body/.//button[contains(text(),'Get Started')]");
	By datastructurelink = By.xpath("//html/.//a[contains(text(),'Data Structures')]");
	
	By reglink = By.xpath("//html/.//a[contains(text(),'Register')]");
	By uname = By.id("id_username");
	By p1 = By.xpath(".//html/.//input[@id='id_password1']");
	By userPass = By.xpath(".//input[@name='password']");
	By pass = By.xpath(".//input[@name='password1']");
	By passconfirm = By.xpath(".//input[@name='password2']");
	By regbtn = By.xpath(".//html/.//input[@value='Register']");
	By loggedintext = By.xpath(".//html/.//div[contains(text(),'You are logged in')]");
	
		
	public void openDsPortal() {
	driver.get("https://dsportalapp.herokuapp.com");	
}	
	public void clickGetStarted() {
		driver.findElement(startbtn).click();
	}
	
	public void valDSLink() {
	
		if(driver.findElement(datastructurelink).isDisplayed()) {
			System.out.println("Navigation to homepage successful");
		}else {
			System.out.println("Error and Navigation to homepage un-successful");
		} 
	}
	
	public void regLink() {
		driver.findElement(reglink).click();
	}
	
	
	public void credentials(String username, String password1) {
		System.out.println(password1);
		driver.findElement(uname).sendKeys(username);
		driver.findElement(pass).sendKeys(password1);
		driver.findElement(passconfirm).sendKeys(password1);		
	}
		
	
	public void clickRegisterBtn() {
		driver.findElement(regbtn).click();
	}
	public void valRegPage() {
		
		if(driver.findElement(loggedintext).isDisplayed()) {
			System.out.println("Navigation to homepage successful");
		}else {
			System.out.println("Error and Navigation to homepage un-successful");
		} 
	}
	
	
		
	}



