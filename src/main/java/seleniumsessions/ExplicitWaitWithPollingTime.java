package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithPollingTime {
        static WebDriver driver;
	public static void main(String[] args) {
		
		//polling time in selenium =500milliseconds
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//500ms is default polling time
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailId)).sendKeys("test@gmail.com");
		
		
		By terms = By.linkText("Terms & Conditions");
		
		ElementUtil eleU = new ElementUtil(driver);
		eleU.waitForElementAndClick(terms, 10);
		
		

	}

}
