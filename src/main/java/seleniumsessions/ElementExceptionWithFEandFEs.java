package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExceptionWithFEandFEs {
	static WebDriver driver;
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
	By logo = By.className("img-responsive11");
		
	//driver.findElement(logo).click();	//No such element exception
	
	List<WebElement> logos = driver.findElements(logo);
	System.out.println(logos);//returns empty array if elements is wrong
	
	}

}
