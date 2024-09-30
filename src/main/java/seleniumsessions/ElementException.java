package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//Create the WebElement + Perform action(sendKey)
		
		driver.findElement(By.id("input-email11")).sendKeys("test@gmail.com");//No such element exception while creating the web element.

	}

}
