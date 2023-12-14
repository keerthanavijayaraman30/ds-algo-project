package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class StackPage {
	
	WebDriver driver;

	public StackPage (WebDriver driver) {
		this.driver = driver;
	}
	By valdslink = By.xpath("//a[contains(text(),'Data Structures')]");
	By stack = By.xpath("//html/.//a[@href ='/stack']");
	By oprinstack = By.xpath("//a[@href ='operations-in-stack']");
	By implelink = By.xpath("//a[@href ='implementation']");
	By applilink = By.xpath("//a[@href='stack-applications']");
	By tyherebtn = By.xpath("html//.//a[@href='/tryEditor']");
	By runbtn=By.xpath("html//.//button[@type = 'button']");
	By valOutput = By.xpath("//*[@id=\"output\"]");
	
	
	
	public void clkstack()
	{
		driver.findElement(valdslink).click();
		driver.findElement(stack).click();
	}
	
	public void firstlink()
	{
		driver.findElement(oprinstack).click();
	}
	
	public void secondlink()
	{
		driver.findElement(implelink).click();
	}
	
	public void thirdlink()
	{
		driver.findElement(applilink).click();
	}
	
	public void tryHerebtn()
	{
		driver.findElement(tyherebtn).click();
	}
	
	public void enterText() {
		new Actions(driver).sendKeys("print('Ninja Testers')").perform();
			
	}
	
	public void runbtn()
	{
		driver.findElement(runbtn).click();
		Assert.assertEquals(driver.findElement(valOutput).getText(),"Ninja Testers");
	}
	
}
