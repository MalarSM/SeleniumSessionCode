package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//back and forward browser simulation
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);//used to pause the script 
		
		driver.navigate().to("http://www.amazon.com/");
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		//driver.navigate().to(new URL("http://www.google.com/"));
		
		//get and to method are same
		//to method is overloaded method
		
		driver.navigate().refresh();
		
		
	}

}
