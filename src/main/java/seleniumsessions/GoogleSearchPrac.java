package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPrac {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By searchField = By.name("q");
		By suggestions = By.xpath("//ul/li//div[@class='wM6W7d']/span");
		
		driver.findElement(searchField).sendKeys("flower");
		List<WebElement> suggList = driver.findElements(suggestions);
		System.out.println(suggList.size());

	}

}
