package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeGoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By searchField = By.name("q");
		By suggestions = By.xpath("//ul/li//div[@class='wM6W7d']/span");
		
		doSearch(searchField, searchField, "selenium", "food" );
		
	}
	
	public static void doSearch(By searchField, By suggestions, String searchKey, String matchValue) {
		driver.findElement(searchField).sendKeys(searchKey);
		List<WebElement> suggList = getElements(suggestions);
		int totalCount = suggList.size();
		System.out.println(totalCount);
		
//		for(WebElement e : suggList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains(matchValue)) {
//				e.click();
//				break;
//			}
			
	//	}
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
