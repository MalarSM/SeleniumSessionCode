package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> linksList1 = driver.findElements(By.tagName("a"));
		int totallinks = linksList1.size();
		System.out.println("total links : " +totallinks);
		
		for(int i=0; i<totallinks; i++) {
			String text = linksList1.get(i).getText();
			if(text.length() == 0) {
				System.out.println("Total links with no text" + "=" + i);
			}
			
		}

	}

}
