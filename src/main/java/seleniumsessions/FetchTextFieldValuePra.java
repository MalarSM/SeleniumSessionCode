package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FetchTextFieldValuePra {
	public static void main(String[] args) {
		
		BrowserUtil BrU = new BrowserUtil();
		WebDriver driver = BrU.intiBrowser("chrome");
		BrU.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		
		ElementUtil eleU = new ElementUtil(driver);
		eleU.doSendKeys(firstName, "malartester");
		String fetchValue = eleU.getElementAttribute(firstName, "value");
		String placeHolder1 = eleU.getElementAttribute(firstName, "placeholder");
		System.out.println("The value enter is :" + fetchValue);
		System.out.println("The placeholder value is :" + placeHolder1);
		
	}

}
