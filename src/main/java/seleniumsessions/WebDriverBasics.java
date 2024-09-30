package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//enter url
		driver.get("https://www.google.com");
		
		//Get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//act vs expected : Validation steps
		if(title.equals("Google")) {
			System.out.println("Correct title -- Pass");
		}else {
			System.out.println("Correct title -- Fail");
		}
		
		//Close the browser
		driver.quit();

	}

}
