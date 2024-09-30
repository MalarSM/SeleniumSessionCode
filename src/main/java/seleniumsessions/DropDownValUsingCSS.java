package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownValUsingCSS {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		By country = By.cssSelector("select#Form_getForm_Country > option[value='Afghanistan'] ~ option");
		checkCountryDropDown(country);
		}
	
	public static void checkCountryDropDown(By locator) {
		List<WebElement> listCountry = getElements(locator);
		int noOfCountry = listCountry.size();
		System.out.println(noOfCountry);
		for(WebElement e : listCountry) {
			String list = e.getText();
			System.out.println(list);
			
		}
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
