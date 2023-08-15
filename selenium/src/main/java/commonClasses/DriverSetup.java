package commonClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	
	public static WebDriver setupDriver() {
		
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("Webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
	}

}
