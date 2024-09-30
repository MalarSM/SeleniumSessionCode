package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeXpath1 {
  static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		//By countryDD = By.id("Form_getForm_Country");
		 
		By countryDD =By.xpath("//select[@id='Form_getForm_Country']");
		
		
		//getDropDownValues(countryDD);
		//selectByIndex(countryDD, 1);
		//selectByVisibleText(countryDD, "India");
		//selectByVisibleText(countryDD,"Angola");
		
		
		//single country:
		//if(getDropDownValues(countryDD).contains("India")) {
		//	System.out.println("PASS");
		//}
		
		//Multiple countries:
		List<String> expectedList = Arrays.asList("India","Aruba","Australia");
		if(getDropDownValues(countryDD).containsAll(expectedList)){
			System.out.println("PASS");
		}
		
	}
	
	public static List<String> getDropDownValues(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> dropDownList = select.getOptions();
		System.out.println(dropDownList.size());
		List<String> optionsText = new ArrayList<String>();
		
		for(WebElement e : dropDownList ) {
			String text = e.getText();
			optionsText.add(text);
			System.out.println(text);
		}
		return optionsText;
	}
	
	public static void selectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	public static void selectByVisibleText(By locator, String tex) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(tex);
		
	}
	public static void selectByVaule(By locator, String tex) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(tex);
		
	}
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	} 

}
