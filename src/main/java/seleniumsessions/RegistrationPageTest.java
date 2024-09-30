package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {

	public static void main(String[] args) {

		BrowserUtil brUtli = new BrowserUtil();
		WebDriver driver = brUtli.intiBrowser("chrome");
		
		brUtli.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(brUtli.getPageTitle());
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By eMail = By.id("input-email");
		By telePhone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By agreeCheckBox = By.name("agree");
		By continueBtn = By.className("btn-primary");
		//By successMsg = By.tagName("h1");
		
		ElementUtil eleUtli = new ElementUtil(driver);
		
		eleUtli.doSendKeys(firstName, "Malarvizhi");
		eleUtli.doSendKeys(lastName, "Saravana");
		eleUtli.doSendKeys(eMail, "malar@gmail.com");
		eleUtli.doSendKeys(telePhone, "6692323222");
		eleUtli.doSendKeys(password, "test@123");
		eleUtli.doSendKeys(confirmPassword, "test@123");
		eleUtli.doClick(agreeCheckBox);
		eleUtli.doClick(continueBtn);
		
		//brUtli.browserQuit();

	}

}
