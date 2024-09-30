package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {
	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
//		Boolean flag = driver.findElement(By.className("img-responsive")).isDisplayed();
//		System.out.println(flag);
//		
//		if(flag) {
//			System.out.println("Logo is present");
//		}else {
//			System.out.println("Logo is not present");
//		}
		
		By logo = By.className("img-responsive");
		if(isElementDisplayed(logo)) {
			
		}
		
        
	}
	
	public static boolean isElementDisplayed(By locator) {
		try {
            return getElement(locator).isDisplayed();
		}catch(NoSuchElementException e){
			System.out.println("Element is not displayed: " + locator);
			return false;
		}
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
