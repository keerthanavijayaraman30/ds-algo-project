package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {
	public WebDriver driver;
	
	
	public void setWebDriver() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void quitDriver () {
		driver.quit();
	}
	
}
