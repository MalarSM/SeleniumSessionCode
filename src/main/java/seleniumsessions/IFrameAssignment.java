package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Malar");
		
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Tester");
		
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("08/09/1991");
		
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("I wanted to become a automation tester shortly");
		
		WebElement chooseFile = driver.findElement(By.name("RESULT_FileUpload-6"));
		chooseFile.sendKeys("D:/Automation/Screenshot 2024-06-03 200130.png");
		
		driver.findElement(By.name("RESULT_TextField-8")).sendKeys("Testing");
		
		driver.findElement(By.name("RESULT_TextField-9")).sendKeys("QA");
		
		driver.findElement(By.name("RESULT_TextField-10")).sendKeys("1111 N Mission Park Blvd");
		
		driver.findElement(By.name("RESULT_TextField-12")).sendKeys("chandler");
		By state = By.xpath("//Select[@id='RESULT_RadioButton-13']");
		WebElement st = driver.findElement(state);
	    Select select = new Select(st);
	    select.selectByVisibleText("Arizona");
	    
	    driver.findElement(By.name("RESULT_TextField-14")).sendKeys("85224");
	    
	    driver.findElement(By.name("RESULT_TextField-15")).sendKeys("669 222 2222");
	    
	    driver.findElement(By.name("RESULT_TextField-16")).sendKeys("tester@gmail.com");
	    
	    driver.findElement(By.name("Submit")).click();
	    
		
		
	}

}
