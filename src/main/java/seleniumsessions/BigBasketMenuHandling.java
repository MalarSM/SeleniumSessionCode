package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuHandling {
	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			// Actions class: default 
			// user actions: mouse and keyboard
			driver = new ChromeDriver();

			driver.get("https://www.bigbasket.com/");
			
//			By category = By.xpath("(//span[text()='Shop by'])[2]");
//			By category1 = By.xpath("(//a[text()='Fruits & Vegetables'])[1]");
//			By category2 = By.linkText("Exotic Fruits & Veggies");
//			By category3  =By.linkText("Exotic Vegetables");
			
			By category = By.xpath("(//span[text()='Shop by'])[2]");
			By category1 = By.linkText("Fruits & Vegetables");
			By category2 = By.linkText("Exotic Fruits & Veggies");
			By category3  =By.linkText("Exotic Vegetables");
			ParentChildMenu(category,category1,category2,category3 );
			
			

	}
		public static void ParentChildMenu(By category, By category1, By category2, By category3 ) throws InterruptedException {
			getElement(category).click();
			Actions act = new Actions(driver);
			act.moveToElement(getElement(category1)).perform();
			Thread.sleep(3000);
			act.moveToElement(getElement(category2)).perform();
			Thread.sleep(3000);
			getElement(category3).click();
		}

		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
}
