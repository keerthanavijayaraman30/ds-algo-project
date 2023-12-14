package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {
	private static WebDriver driver;
	
	private DriverFactory() {
		
	}
	
	
	public static void setWebDriver() {
		
	}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		}
		return driver;
	}
	
	public static void quitDriver () {
		driver.quit();
	}
	
}
