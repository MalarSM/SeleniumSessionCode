package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		//total images
		
//		 List<WebElement> imagesList = driver.findElements(By.tagName("img"));
//         int imagesCount = imagesList.size();
//         System.out.println("total images :" + imagesCount);
//	
//	
//	for(WebElement e : imagesList) {
//		String srcValue = e.getAttribute("src");
//		System.out.println("Image src attribute :" + srcValue);
//	}
	
	//Capture all the links
	//print the link text and href values
	
		 List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println();
	}
}
