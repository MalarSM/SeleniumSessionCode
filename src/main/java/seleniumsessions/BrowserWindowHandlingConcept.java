package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowHandlingConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");//parent window
		
		//If attribute is target = _blank, then it will open in a new window. 
		
		WebElement execProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		//execProfile.click(); //child window
		
		Actions act = new Actions(driver);
		act.click(execProfile).perform();
		
		//1. fetch the window ids for parent and child windows
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWIndowId = it.next();
		System.out.println("parentWIndowId:"  + parentWIndowId);
		
		String childWindowId = it.next();
		System.out.println("childWindowId:"  + childWindowId);
		
		//2.Switching work:
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window title:" + driver.getTitle());
		driver.close();//close the child window
		//driver is lost
		
		driver.switchTo().window(parentWIndowId);
		System.out.println("parent window title:" + driver.getTitle());
		
		driver.quit();
		
	}

}
