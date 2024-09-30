package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
        static WebDriver driver;
	public static void main(String[] args) {
		//2. ExplicitWait
		  //2.2.a WebDriverWait
		  //2.2.b FluentWait
		
		//wait(InterFace) until(); ---->This interface is implemented by FluentWait(c) until(){} + individual methods(){} --> WebDriverWait(c) -- no methods
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	     
		By emailId =By.id("input-email");
		By password = By.id("input-password");
		By logBtn = By.xpath("//input[@type='submit']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		email_ele.sendKeys("welcome@gmail.com");
//		
//		driver.findElement(password).sendKeys("tester@1");
//		driver.findElement(logBtn).click();
		waitForElementVisible(emailId, 10).sendKeys("naveen@gmail.com");//10 : 2 --> 2   10:12 : NSE timeout
		getElement(password).sendKeys("test@123");
		getElement(logBtn).click();
	
	}
	
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
	}
	
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); 
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
