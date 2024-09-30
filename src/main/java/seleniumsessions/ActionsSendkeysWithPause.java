package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendkeysWithPause {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstName = By.id("input-firstname");
		
		doActionsSendKeysPause(firstName, "TesterMalar", 200);
		

	}
	
	public static void doActionsSendKeysPause(By locator, String value, long pauseTime) {
             Actions act = new Actions(driver);
             char ch[] = value.toCharArray();
             for(char c : ch) {
            	 act.sendKeys(getElement(locator),String.valueOf(c)).pause(pauseTime).perform();
             }
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
