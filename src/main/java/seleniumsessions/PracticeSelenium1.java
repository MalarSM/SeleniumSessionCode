package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());//google
		
		driver.navigate().to("https://www.gmail.com/");
		
		System.out.println(driver.getTitle());//gmail
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());//google
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());//gmail
	}

}
