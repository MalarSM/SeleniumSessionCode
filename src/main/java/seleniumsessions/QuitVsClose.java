package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//session id =123
		
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
		//driver.close();
		
		 driver = new ChromeDriver();//session id =456
		
		System.out.println(driver.getTitle());
		

	}

}
