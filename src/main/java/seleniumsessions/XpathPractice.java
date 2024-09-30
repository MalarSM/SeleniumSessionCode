package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		
		By header = By.xpath("//h4[@class='form-title']");
		By fullName = By.xpath("//input[@name='Name' and @placeholder='Your Full Name*']");
		By links = By.xpath("//a");
		
		
		String title = driver.findElement(header).getText();
		System.out.println(title);
		WebElement name =driver.findElement(fullName);
		name.sendKeys("Malarvizhi");
		int totalLinks = driver.findElements(links).size();
		System.out.println(totalLinks);
		

	}

}
