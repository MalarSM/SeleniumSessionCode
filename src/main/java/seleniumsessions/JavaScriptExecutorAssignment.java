package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorAssignment {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();//top casting
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement fName = driver.findElement(By.id("input-firstname"));
		fName.sendKeys("Malar");
		flash(fName);
		WebElement  lName = driver.findElement(By.id("input-lastname"));
		lName.sendKeys("vizhi");
	    flash(lName);
		WebElement  eMail = driver.findElement(By.id("input-email"));
		eMail.sendKeys("malarv@test.com");
		 flash(eMail);
		WebElement  tPhone = driver.findElement(By.id("input-telephone"));
		tPhone.sendKeys("8899717888");
		  flash(tPhone);
		WebElement  pwd = driver.findElement(By.id("input-password"));
		pwd.sendKeys("test@132");
		flash(pwd);
		WebElement  cPwd = driver.findElement(By.id("input-confirm"));
		cPwd.sendKeys("test@132");
		 flash(cPwd);
		WebElement  cBox = driver.findElement(By.name("agree"));
		flash(cBox);
		cBox.click();
		WebElement  cont = driver.findElement(By.xpath("//input[@type='submit']"));
		 flash(cont);
		 cont.click();
        
		
	}
	
	public static void flash(WebElement element) {
		String bgcolor = element.getCssValue("backgroundColor");//white
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element);// Green
			changeColor(bgcolor, element);// While
		}
	}

	public static void changeColor(String color, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);//G-->W--G--W---G--W
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}
	

}
