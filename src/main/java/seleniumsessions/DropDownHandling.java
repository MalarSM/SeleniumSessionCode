package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		
		//Drop down - htmltag: <select>
		//use select class in the selenium
		//To use select class - select class is mandatory
        // Select -- Option
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		By country = By.id("Form_getForm_Country");
		//WebElement countryEle = driver.findElement(country);
		
		//Select select = new Select(countryEle);
		
		//select.selectByVisibleText("Afghanistan");
		//select.selectByValue("Andorra");
		//select.selectByIndex(3);
		selectDropDownValueByVisibleText(country,"Andorra");
		selectDropDownValueByIndex(country, 10);
		selectDropDownByValue(country, "Cook Islands");
		
		
	}
	public static void selectDropDownValueByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
		
	}
	
	public static void selectDropDownByValue(By locator, String value){
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void selectDropDownValueByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}

}
