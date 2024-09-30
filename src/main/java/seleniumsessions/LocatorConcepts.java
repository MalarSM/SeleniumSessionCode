package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {

	public static void main(String[] args) {
		
		//Locators in selenium - means how to identify the webelement
		//Create web element(FE) + perform action(click)
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//By header = By.tagName("h1");
		//1.Id: is an attribute: unique 
//		driver.findElement(By.id("input-firstname")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-lastname")).sendKeys("test@123");
//		
		//2.name : is an attribute, can be duplicate
		//driver.findElement(By.name("firstname")).sendKeys("malar@test.com");
		
		//3.className: is an attribute, can be duplicate
		//driver.findElement(By.className("form-control")).sendKeys("Malar");
		
        //4.xpath: is not an attribute, address of the webelement in DOM
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Malar");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Vizhi");
		
		//5.cssSelector is not an attribute
		//driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Ila");
		//driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Mukil");
		
		//6.linkText: only for links, but text can be duplicate
		//htmltag =<a>
		//driver.findElement(By.linkText("Forgotten Password")).click();
		
		//7. partialLinkText: only for links
		//driver.findElement(By.partialLinkText("Password")).click();
		
		//8. tagName
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		if(header.equals("Register Account")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}

	}

}
