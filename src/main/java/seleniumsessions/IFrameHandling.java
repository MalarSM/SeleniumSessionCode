package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		//click on img:
		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Automation");
		
		//need to come out of iframe, or come to main page:
		driver.switchTo().defaultContent();
		
		//this ele is on the page
				String header = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
				System.out.println(header);
	}

}
