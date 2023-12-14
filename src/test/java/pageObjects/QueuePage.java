package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class QueuePage {
	WebDriver driver;

	public QueuePage (WebDriver driver) {
		this.driver = driver;
	}
	By valdslink = By.xpath("//a[contains(text(),'Data Structures')]");
	By queue = By.xpath("//html/.//a[@href ='/queue']");
	By impleofqueue = By.xpath("//a[@href='implementation-lists']");
	By impleusingcollect = By.xpath("//html/.//a[@href = 'implementation-collections']");
	By impleusingarray = By.xpath("//html/.//a[@href='Implementation-array']");
	By queueop = By.xpath("//html/.//a[@href='QueueOp']");
	By tyherebtn = By.xpath("html//.//a[@href='/tryEditor']");
	By runbtn=By.xpath("html//.//button[@type = 'button']");
	By valOutput = By.xpath("//*[@id=\"output\"]");
	
	
	
	public void clkqueue()
	{
		driver.findElement(valdslink).click();
		driver.findElement(queue).click();
	}
	
	public void firstqueuelink()
	{
		driver.findElement(impleofqueue).click();
	}
	
	public void secondqueuelink()
	{
		driver.findElement(impleusingcollect).click();
	}
	
	public void thirdqueuelink()
	{
		driver.findElement(impleusingarray).click();
	}
	public void fourthqueuelink()
	{
		driver.findElement(queueop).click();
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
