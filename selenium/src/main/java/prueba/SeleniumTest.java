package prueba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hola cool testers");
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		Thread.sleep(2000);
		driver.manage().window().maximize(); // Maximizar ventana

		// OBTENIENDO WEB ELEMENTS DE PAG WEB
		WebElement userNameTxt = driver.findElement(By.id("user-name"));
		WebElement pwdTxt = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));

		// HACIENDO LOGIN
		userNameTxt.sendKeys("standard_user");
		Thread.sleep(500);
		pwdTxt.sendKeys("secret_sauce");
		Thread.sleep(500);
		loginBtn.click();
		Thread.sleep(500);

		// METODOS DE EXPLORADOR
		// Obtener el titulo de la pagina actual
		String title = driver.getTitle();
		System.out.println("el titulo es: " + title);

		// OBTENER LA URL
		String url = driver.getCurrentUrl();
		System.out.println("la URL actual es " + url);

		// METODOS DE NAVEGACION
		// driver.navigate().back();
		// Thread.sleep(2000);
		// driver.navigate().forward();
		// Thread.sleep(2000);
		driver.navigate().refresh();
		//
		// Verificar elemento desplegado
		boolean inventoryItemIsDisplayed = driver.findElement(By.className("inventory_item_name")).isDisplayed();

		if (inventoryItemIsDisplayed) {
			System.out.println("el articulo esta desplegado");
		}

		// OBTENER TEXTO DE WEB ELEMENT
		String itemName = driver.findElement(By.className("inventory_item_name")).getText();

		if (itemName.contains("Sauce Labs")) {
			System.out.println("El producto es correcto");
		} else {
			System.out.println("Error: el producto es incorrecto");
		}

		// DROPDOWN
		Select oSelect = new Select(driver.findElement(By.xpath("//select[ @data-test = 'product_sort_container']")));
		oSelect.selectByVisibleText("Price (high to low)");

		// FindElements
		List<WebElement> prodLists = driver.findElements(By.className("inventory_item_name"));
		System.out.println("numero de elementos en lista" + prodLists.size());

		// String primerItem = prodLists.get(0).getText();
		// System.out.println(primerItem);

		// String segundoItem = prodLists.get(1).getText();
		// System.out.println(segundoItem);

		for (int i = 0; i < prodLists.size(); i++) {
			System.out.println("los productos son:" + prodLists.get(i).getText());
			if (!prodLists.get(1).getText().contains("Labs")) {
				System.out.println("El producto no es un producto LABS valid");
				break;
			}

			// continuacion end to end (yo hice)
			// click en add to cart
			// WebElement addToCart = driver.findElement(By.xpath("//button[ @data-test =
			// 'add-to-cart-sauce-labs-backpack']"));
			// addToCart.click();

			// click en cart
			// WebElement cart = driver.findElement(By.className("shopping_cart_link"));
			// cart.click();

			// Click en checkout
			// WebElement checkout = driver.findElement(By.xpath("//button[ @data-test =
			// 'checkout']"));
			// checkout.click();

			// Your information
			// Obteniendo los WebElements

			// WebElement firstName = driver.findElement(By.xpath("//input[ @data-test =
			// 'firstName']"));
			// WebElement lastName = driver.findElement(By.xpath("//input[ @data-test =
			// 'lastName']"));
			// WebElement zip = driver.findElement(By.xpath("//input[ @data-test =
			// 'postalCode']"));

			// introduciendo los datos
			// firstName.sendKeys("Lizzet");
			// Thread.sleep(2000);
			// lastName.sendKeys("Garcia");
			// Thread.sleep(2000);
			// zip.sendKeys("98899");

			// WebElement continue
			// WebElement btnContinue = driver.findElement(By.xpath("//input[ @data-test =
			// 'continue']"));
			// btnContinue.click();

			// WebElement finish
			// WebElement btnFinish = driver.findElement(By.xpath("//button[ @data-test =
			// 'finish']"));
			// btnFinish.click();

			// comprobando el header
			// String Header =
			// driver.findElement(By.className("complete-header")).getText();

			// if (Header.contains("Thank you for your order!")) {
			// System.out.println("se logro");
			// }else {
			// System.out.println("no se logro");
			// }

		}

		// cerrando navegador web
		// driver.close(); //cierra ventana actual que el webdriver esta usando
		driver.quit(); // cierra todas las ventanas que selenium abrio

	}
}
