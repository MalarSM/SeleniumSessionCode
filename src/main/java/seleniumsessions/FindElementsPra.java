package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementsPra {

	public static void main(String[] args) {
			
		BrowserUtil BrU = new BrowserUtil();
		WebDriver driver = BrU.intiBrowser("chrome");
		BrU.enterUrl("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		List<WebElement>   linksList = driver.findElements(By.tagName("a"));
		int totalLinks = linksList.size();
		System.out.println("Total links:" + totalLinks);
		
		for(WebElement e : linksList) {
			  String text = e.getText();
			  if(text.length() == 0) {
				  System.out.println(e + "=" + text);
			  }
		
	}

}}
