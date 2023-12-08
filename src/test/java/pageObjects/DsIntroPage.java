package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DsIntroPage {
	WebDriver driver;

	public DsIntroPage (WebDriver driver) {
		this.driver = driver;
	}
		
		By dsintroGetStbtn = By.xpath("html//.//a[@href=\"data-structures-introduction\"]");
		By tclink = By.xpath("html//.//a[@href='time-complexity']");
		By tyherebtn = By.xpath("html//.//a[@href='/tryEditor']");
		By runbtn=By.xpath("html//.//button[@type = 'button']");
		

	public void dsgetstartbtn() {
		driver.findElement(dsintroGetStbtn).click();
		
	}
	
		public void timecomplexlink()
		{
			driver.findElement(tclink).click();
		}
		
		public void tryHerebtn()
		{
			driver.findElement(tyherebtn).click();;
		}
		
		public void runbtn()
		{
			driver.findElement(runbtn).click();
		}
		//
		
		public void test() {
			
		}
}
