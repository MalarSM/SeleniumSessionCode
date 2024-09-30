package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		int frameCount = driver.findElements(By.tagName("frame")).size();
		System.out.println(frameCount);
		
		//frame: deprecated
				//iframe: w3c
		
		//driver.switchTo().frame(2);
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		String title = driver.findElement(By.tagName("h2")).getText();
		System.out.println(title);
		
	}

}
