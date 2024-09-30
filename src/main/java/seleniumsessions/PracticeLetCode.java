package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeLetCode {

	public static void main(String[] args) {
		
		BrowserUtil brUt = new BrowserUtil();
		
		WebDriver driver = brUt.intiBrowser("chrome");
		
		brUt.enterUrl("https://letcode.in/edit");
		
		String url = brUt.getPageURL();
		System.out.println(url);
		
		String title = brUt.getPageTitle();
		System.out.println(title);
		
		By enterFullName = By.id("fullName");
		
		By confirmEdit = By.id("noEdit");
		By clearText = By.id("clearMe");
		
		
		ElementUtil elUt = new ElementUtil(driver);
		elUt.doSendKeys(enterFullName, "Malarvizhi");
		boolean cf = elUt.isElementEnabled(confirmEdit);
		System.out.println(cf);
		
		elUt.doClear(clearText);

	}

}
