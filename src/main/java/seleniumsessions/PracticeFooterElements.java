package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFooterElements {

     static WebDriver driver;

public static void main(String[] args) {
			
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			By footer = By.cssSelector("footer li");
			checkFooterList(footer);
		
}
		public static List<String> checkFooterList(By locator) {
			List<WebElement> footerList = getElements(locator);
			List<String> footerListName = new ArrayList<String>();
			int noOffooter = footerList.size();
			System.out.println(noOffooter);
			for(WebElement e : footerList) {
				String list = e.getText();
				footerListName.add(list);
				System.out.println(footerListName);
				}
			return footerListName;
		}
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}

}
	

