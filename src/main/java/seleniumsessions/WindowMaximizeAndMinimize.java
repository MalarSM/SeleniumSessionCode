package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMaximizeAndMinimize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();//
		//driver.manage().window().fullscreen();//fit to screen
		driver.manage().window().minimize();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//viewport -- window size: 

	}

}
