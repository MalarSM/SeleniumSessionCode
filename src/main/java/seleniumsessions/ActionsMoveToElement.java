package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		// Actions class: default 
				// user actions: mouse and keyboard
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//By parentMenu = By.xpath("//div[text()='Add-ons']");
		//By childMenu = By.xpath("//div[text()='Visa Services']");
		
		//ParentChildMenu(parentMenu, childMenu);
		ParentChildMenu("SpiceClub", "Benefits");


	}
	
	public static void ParentChildMenu(By parentMenu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(2000);
		getElement(childMenu).click();
		
	}
	
	public static void ParentChildMenu(String parentMenu, String childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(By.xpath("//*[text()='"+parentMenu+"']"))).perform();
		Thread.sleep(2000);
       getElement(By.xpath("//*[text()='"+childMenu+"']")).click();
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
