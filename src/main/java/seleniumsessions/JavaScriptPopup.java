package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {
		// JS Alerts:
		//1.alert
		//2.confirm
		//3.prompt - only one text field
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1.Alert:
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(2000);
//		Alert alert =driver.switchTo().alert();
//		
//		String text = alert.getText();
//		System.out.println(text);
//		//alert.accept();
//		alert.dismiss();
		
		//2.confirm:
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		//alert.accept();
//		alert.dismiss();
		
		//3.Prompt:
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.sendKeys("I am Malarvizhi Saravana");

		alert.accept(); //click on OK
		//alert.dismiss();//just cancel this alert: click on cancel
		
		//NoAlertPresentException: no such alert in case of no JS popup on the page.
		
		
		

	}

}
