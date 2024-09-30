package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorPractice {

	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
			
			WebElement fName = driver.findElement(By.xpath("//label[text()='First Name']"));
			WebElement lName = driver.findElement(By.xpath("//label[text()='Last Name']")); 
			WebElement email = driver.findElement(By.xpath("//label[text()='E-Mail']")); 
			WebElement tPhone = driver.findElement(By.xpath("//label[text()='Telephone']"));
			WebElement pwd = driver.findElement(By.xpath("//label[text()='Password']")); 
			WebElement cPwd = driver.findElement(By.xpath("//label[text()='Password Confirm']"));
			WebElement subscribe = driver.findElement(By.xpath("//label[text()='Subscribe']"));
			WebElement gtext = driver.findElement(By.xpath("//div[text()='I have read and agree to the ']"));
			WebElement policyLink = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
			WebElement continueBtn = driver.findElement(By.xpath("//input[@type='submit']"));
			
			driver.findElement(with(By.name("firstname")).toRightOf(fName)).sendKeys("Malarvizhi");
			driver.findElement(with(By.name("lastname")).toRightOf(lName)).sendKeys("Saravana");
			driver.findElement(with(By.id("input-email")).toRightOf(email)).sendKeys("testermalar@testing.com");
			driver.findElement(with(By.id("input-telephone")).toRightOf(tPhone)).sendKeys("7825252628");
			driver.findElement(with(By.id("input-password")).toRightOf(pwd)).sendKeys("Test123");
			driver.findElement(with(By.id("input-confirm")).toRightOf(cPwd)).sendKeys("Test123");
			driver.findElement(with(By.xpath("//label[normalize-space()='Yes']")).toRightOf(subscribe)).click();
			System.out.println(gtext.getText());
			//driver.findElement(with(By.name("agree")).toRightOf(policyLink)).click();
			driver.findElement(with(By.name("agree")).toLeftOf(continueBtn)).click();
			
			

	}

}
