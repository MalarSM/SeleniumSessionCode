package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class ActionsMethodChainingRegisterPage {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		
		Actions act = new Actions(driver);
		
		Action ac = act.sendKeys(firstName, "Malar")
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys("vizhi")
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys("malar@gmail.com")
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys("9999921111")
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys("Test@123")
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys("Test@123")
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys(Keys.SPACE)
				.pause(500)
				.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys(Keys.ENTER)
				.build();
		ac.perform();
				
	}

}
