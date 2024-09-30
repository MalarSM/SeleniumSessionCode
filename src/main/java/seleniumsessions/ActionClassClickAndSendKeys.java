package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassClickAndSendKeys {

		//WebElement.SendKeys
		//Actions.SendKeys-->move--->click--->sendkeys (Simulating user actions)
		
		//WebElement.click --->click
		//Actions.click-->move--->click 

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			driver = new ChromeDriver();

			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
			Actions act = new Actions(driver);
			act.sendKeys(driver.findElement(By.name("firstname")), "Malar").perform();
			act.sendKeys(driver.findElement(By.name("agree"))).perform();
			
			//two ways of entering the value into a text field:
			//WE.SK
			//AC.SK
			//JS.SK
			
	}

}
