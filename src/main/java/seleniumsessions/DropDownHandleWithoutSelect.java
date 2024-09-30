package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelect {
      static WebDriver driver;
	public static void main(String[] args) {
		
		//Interview Questions:
				//Get all the options using Select and without select
				//Select a country (India)

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		
		
	}

}
