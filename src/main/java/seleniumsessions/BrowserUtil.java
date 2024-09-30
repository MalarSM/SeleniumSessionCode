package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	WebDriver driver;
	/**
	 * CrossBrower method
	 * @return
	 */
	public WebDriver intiBrowser(String browser) {
		System.out.println("Browser name: " + browser);
		
		switch (browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass the right browser...");
			throw new BrowserException("Invalid Browser");
		}
		return driver;
		}
	/**
	 * Enter the Url method
	 * @param url
	 */
	public void enterUrl(String url) {
		if(url.indexOf("http") != 0) {
			throw new BrowserException("http(s) is missing in the url");
		}
		driver.get(url);
	}
	
	public void enterURL(URL url) {
		driver.navigate().to(url);
	}
	public String getPageTitle() {
		return driver.getTitle();
		
	}
	
	public String getPageURL() {
		return driver.getCurrentUrl();
		
	}
	public void browserQuit() {
		driver.quit();
	}
	
	

}
