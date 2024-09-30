package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooter {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			
			By footerList = By.xpath("//div[text()='Get to Know Us']//following-sibling::ul//a");
			
			List<WebElement> footerListText =driver.findElements(footerList);
			
			System.out.println(footerListText.size());

	}

}
