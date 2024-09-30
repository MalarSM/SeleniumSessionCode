package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			 driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			
			By searchField = By.name("q");
			By suggestions = By.xpath("//ul/li//div[@class='wM6W7d']/span");
			
//			driver.findElement(searchField).sendKeys("selenium");
//			
//			//ElementUtil eleUt = new ElementUtil(driver);
//			//eleUt.doSearch(searchField, suggestions, "selenium", "foods");
//			
//			List<WebElement> suggEleList = driver.findElements(suggestions);
//			System.out.println(suggEleList.size());
//			
//			for(WebElement e: suggEleList) {
//				String text = e.getText();
//				System.out.println(text);
//				if(text.contains("foods")) {
//					e.click();
//					break;
//				}
//			}
			
		}
		
		
		public static void doSerch(By searchField, String searchKey, By suggestions, String matchValue ) {
            
			driver.findElement(searchField).sendKeys(searchKey);
			
			//ElementUtil eleUt = new ElementUtil(driver);
			//eleUt.doSearch(searchField, suggestions, "selenium", "foods");
			
			List<WebElement> suggEleList = driver.findElements(suggestions);
			System.out.println(suggEleList.size());
			
			for(WebElement e: suggEleList) {
				String text = e.getText();
				System.out.println(text);
				if(text.contains("foods")) {
					e.click();
					break;
				}
			}
		}
		

	}


