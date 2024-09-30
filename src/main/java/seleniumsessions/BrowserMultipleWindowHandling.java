package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserMultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		String parentWindowId = driver.getWindowHandle();
		
		WebElement execPro = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		WebElement preRel = driver.findElement(By.xpath("//footer//a[contains(text(),'Press Releases')]"));
		WebElement newsArt = driver.findElement(By.xpath("//footer//a[contains(text(),'News Articles')]"));
		WebElement careers = driver.findElement(By.xpath("//footer//a[contains(text(),'Careers')]"));
		
		Actions act = new Actions(driver);
		act.click(execPro).perform();
		act.click(preRel).perform();
		act.click(newsArt).perform();
		act.click(careers).perform();
		
		// 1. fetch the window ids:
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
			
			if(!windowId.equals(parentWindowId)) {
				driver.close();
				
			}
			Thread.sleep(2000);
		}
			driver.switchTo().window(parentWindowId);
			System.out.println("parent window title :"  +driver.getTitle());;
		}
	}


