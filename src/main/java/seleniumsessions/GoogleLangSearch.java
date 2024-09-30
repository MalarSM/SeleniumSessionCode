package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangSearch {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By googleSearchBtn = By.className("gNO89b");
		
		String btnText = driver.findElement(googleSearchBtn).getText();
		//System.out.println(btnText);
		
	
	}

}
