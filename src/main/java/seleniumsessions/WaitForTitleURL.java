package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.linkText("Login")).click();
		
//		driver.getTitle();//loading...checking...null
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//500ms is default polling time
		
		getPageTitle("Account Login",10);
		
		}
	
	public static String getPageTitle(String ExpectedTitle, int timeOut) {
		if (waitForTitle(ExpectedTitle,timeOut )) {
			return driver.getTitle();
		}
		else {
			return "-1";
		}
		
	}
	
	public static boolean waitForTitle(String ExpectedTitle, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		boolean flag = false;
		try {
			return wait.until(ExpectedConditions.titleIs(ExpectedTitle));
		} catch (Exception e) {
			System.out.println("Title is not matched");
			return flag;
		}
	}
	public static String getPageTitleContains(String fractionTitle, int timeOut) {
		if (waitForTitleContains(fractionTitle,timeOut )) {
			return driver.getTitle();
		}
		else {
			return "-1";
		}
		
	}
	
		public static boolean waitForTitleContains(String fractionTitle, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			boolean flag = false;
			try {
				return wait.until(ExpectedConditions.titleContains(fractionTitle));
			} catch (Exception e) {
				System.out.println("Title is not matched");
				return flag;
			}
			
		}
		
		
	}
 

