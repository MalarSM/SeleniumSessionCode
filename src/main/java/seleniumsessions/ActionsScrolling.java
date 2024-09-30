package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// scrolling to element:
		Actions act = new Actions(driver);
//		act.scrollToElement(driver.findElement(By.linkText("Terms & Conditions"))).pause(200)
//		.click(driver.findElement(By.linkText("Terms & Conditions"))).perform();
//		
//		//Partial scrolling:
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_UP).perform();
//		
//		// scroll to footer of the page
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//		Thread.sleep(2000);
		
		//scroll to top of the page
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		

	}

}
