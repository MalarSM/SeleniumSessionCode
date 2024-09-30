package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//JavaScriptExecutor:
		//Java --> JS code --> JavaScriptExecutor(I) --> executeScript(JS)
		
		driver = new ChromeDriver();//top casting
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(3000);
		
		//interface casting:
//		JavascriptExecutor js = (JavascriptExecutor)driver;//casting
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		String url = js.executeScript(" return document.URL;").toString();
//		System.out.println(url);
		

		WebElement loginForm = driver.findElement(By.id("hs-login"));
		
		WebElement emailId = driver.findElement(By.id("username"));
		
	}

}
