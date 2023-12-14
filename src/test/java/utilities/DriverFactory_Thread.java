package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory_Thread {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	private DriverFactory_Thread() {
		
	}
	
	
	public static void setWebDriver() {
		
	}
	
	public static WebDriver getDriver() {
		if(driver.get() == null) {
			 driver.set(new ChromeDriver());
			 driver.get().manage().window().maximize();
			 driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		}
		return driver.get();
	}
	
	public static void quitDriver () {
		driver.get().quit();
	}
	
}
