package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextFieldValue {
  static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		driver.findElement(By.id("input-email")).sendKeys("malar@gmail.com");
//		String text = driver.findElement(By.id("input-email")).getAttribute("value");
//		System.out.println(text);
		
		By emailId = By.id("input-email");
	
		doSendKeys(emailId ,"tester@gamil.com");
		String v1 = getElementAttribute(emailId , "value");
		
		System.out.println(v1);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static String getElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
    //WE : FE
	//WEs: FEs
	//text: getText
	//attribute : getAttribute
	//enter text: sendKey
	
	
}
