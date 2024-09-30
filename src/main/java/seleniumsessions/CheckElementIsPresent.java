package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementIsPresent {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		By logo = By.className("img-responsive");
		
		int count = driver.findElements(logo).size();
//		
//		if(count == 1) {
//			System.out.println("logo is present");
//		}else {
//			System.out.println("logo is not present");
//		}
		
		System.out.println(isElementPresent(logo));
		System.out.println(isElementPresent(logo,2));
	}
	  public static boolean isElementNotPresent(By locator) {
		  if(getElementsCount(locator)==0) {
			  return true;
		  }
		  return false;
	   }
	  
	  public static boolean isElementPresentMultipleTimes(By locator) {
		  if(getElementsCount(locator)>=1) {
			  return true;
		  }
		  return false;
	   }
	  
	   public static boolean isElementPresent(By locator , int expectedElementCount) {
		  if(getElementsCount(locator)==expectedElementCount) {
			  return true;
		  }
		  return false;
	   }
	   
	   public static boolean isElementPresent(By locator) {
			  if(getElementsCount(locator)==1) {
				  return true;
			  }
			  return false;
		   }
		
		public static int getElementsCount(By locator) {
			return getElements(locator).size();
		}
		
		public static List<WebElement> getElements(By locator){
			return driver.findElements(locator);
		}
		
		
	}


