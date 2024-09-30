package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected {
   static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		Boolean f1 = driver.findElement(By.id("pass")).isEnabled();
//		System.out.println(f1);
//		if(f1.equals(true)) {
//			System.out.println("The pwd field is enabled");
//		}else {
//			System.out.println("The pwd field is disabled");
//		}
		
//	By fieldDispayed = By.id("pass");
//	if(isElementEnabled(fieldDispayed) == true) {
//		System.out.println("The pwd field is enabled");
//		}else {
//			System.out.println("The pwd field is disabled");
//		}
		
		By agreeCheckBox = By.name("agree");
		if(isElementSelected(agreeCheckBox) == true) {
			System.out.println("The element is selected");
		}else {
			System.out.println("The element is not selected");
		}
}
	
	public static boolean isElementSelected(By locator) {
		return getElement(locator).isSelected();
	}
	
	public static boolean isElementEnabled(By locator) {
		return getElement(locator).isEnabled();
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
