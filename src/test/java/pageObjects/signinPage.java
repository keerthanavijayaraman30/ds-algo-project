package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signinPage {

WebDriver driver;

public signinPage (WebDriver driver) {
	this.driver = driver;
}

By signinlnk = By.xpath(".//html/.//a[contains(text(),'Sign in')]");
By logbtn = By.xpath(".//html/.//input[@value ='Login']");
By uname = By.id("id_username");
By userPass = By.xpath(".//input[@name='password']");
By loggedintext = By.xpath(".//html/.//div[contains(text(),'You are logged in')]");


public void signLink()
{
	driver.findElement(signinlnk).click();
}
public void loginCredentials(String username, String password)
{
	driver.findElement(uname).sendKeys(username);
	driver.findElement(userPass).sendKeys(password);
}
public void clickLoginBtn()
{
	driver.findElement(logbtn).click();
}

public void valloggedinpage()
{
	if(driver.findElement(loggedintext).isDisplayed()) {
		System.out.println("Navigation to homepage successful");
	}else {
		System.out.println("Error and Navigation to homepage un-successful");
	} 
}
}
