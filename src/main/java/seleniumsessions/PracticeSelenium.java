package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\chromedriver-win64\\chromedriver.exe") //->for selenium version less than 4.5 
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Enter the url
		driver.get("https://dsrsarees.com/");
		
		//Get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//act vs expected
		if (title.equals("DSR SAREES")) {
			System.out.println("The title is correct---Pass");
			
		}else {
			System.out.println("The title is wrong---fail");
		}

		//Close the browser
		driver.quit();
	}

}
