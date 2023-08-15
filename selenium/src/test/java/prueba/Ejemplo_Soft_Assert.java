package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ejemplo_Soft_Assert {
  @Test
  public void f() {
	  SoftAssert softassert = new SoftAssert();
	  
	  System.out.println("Hola cool testers");
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";
		String badTitle = "jjjj";
		
		softassert.assertEquals(actualTitle, expectedTitle);
		softassert.assertEquals(actualTitle, badTitle);
		
		softassert.assertAll();
  }
}
