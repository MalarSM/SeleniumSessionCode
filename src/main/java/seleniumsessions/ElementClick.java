package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClick {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//Click: button, link, checkbox, radiabutton, image
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//create web element (FE) + perform action(click)
		
		//html tag: <a> only for links:
//		driver.findElement(By.linkText("Login")).click();
//		driver.findElement(By.linkText("Register")).click();
		
		By loginLink = By.linkText("Login");
		By RegisterLink = By.linkText("Register");
		
		doClick(loginLink);
		doClick(RegisterLink);
		
		
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
