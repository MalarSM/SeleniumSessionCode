package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
       
	public static void main(String[] args) {
		
		//type = file is mandatory, if type is not file than we cannot automate that.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement chooseFile = driver.findElement(By.name("upfile"));
		chooseFile.sendKeys("D:/Automation/Screenshot 2024-06-03 200130.png");
		
	}

}
