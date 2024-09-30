package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInforBowlerTable {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/the-hundred-men-s-competition-2024-1417778/manchester-originals-men-vs-oval-invincibles-men-18th-match-1417807/full-scorecard");
		
//		 String name = driver.findElement(By.xpath("//span[text()='Scott Currie']//ancestor::tr//preceding-sibling::td//span")).getText();
//      System.out.println(name);
		
		selectBowler("Adam Zampa");
		System.out.println(getBowlerScore("Adam Zampa"));
		
		selectBowler("Nathan Sowter");
		System.out.println(getBowlerScore("Nathan Sowter"));
		
	}
	
	public static List<String> getBowlerScore(String bowlerName) {
		List<WebElement> bowlerScore = driver.findElements(By.xpath("//span[text()='"+bowlerName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> scoreCardList = new ArrayList<String>();
		for(WebElement e : bowlerScore ) {
			String score = e.getText();
			scoreCardList.add(score);
		}
		return scoreCardList;
	}
	
	public static String selectBowler(String bowlerName) {
	 driver.findElement(By.xpath("//span[text()='"+bowlerName+"']//ancestor::tr//preceding-sibling::td//span")).getText();
		System.out.println(bowlerName);
		return bowlerName;
	}

}
