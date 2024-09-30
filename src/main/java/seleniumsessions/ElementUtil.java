package seleniumsessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	private WebDriver driver;
	
	private Actions act;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
		act = new Actions(driver);
		}
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public boolean isElementDisplayed(By locator) {
		try {
            return getElement(locator).isDisplayed();
		}catch(NoSuchElementException e){
			System.out.println("Element is not displayed: " + locator);
			return false;
		}
	}
	
	public boolean isElementSelected(By locator) {
		return getElement(locator).isSelected();
	}
	
	public boolean isElementEnabled(By locator) {
		return getElement(locator).isEnabled();
		
	}
	
	public void doClear(By locator) {
		getElement(locator).clear();
	}
	
	public String getElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	 public  boolean isElementNotPresent(By locator) {
		  if(getElementsCount(locator)==0) {
			  return true;
		  }
		  return false;
	   }
	  
	  public  boolean isElementPresentMultipleTimes(By locator) {
		  if(getElementsCount(locator)>=1) {
			  return true;
		  }
		  return false;
	   }
	 public  boolean isElementPresent(By locator , int expectedElementCount) {
		  if(getElementsCount(locator)==expectedElementCount) {
			  return true;
		  }
		  return false;
	   }
	   
	   public  boolean isElementPresent(By locator) {
			  if(getElementsCount(locator)==1) {
				  return true;
			  }
			  return false;
		   }
		
	
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public void printElementList(By locator) {
		List<String> eleTextList = getElementTextList(locator);
		for(String e : eleTextList) {
			System.out.println(e);
		}
	}
	
	public  List<String> getElementTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		
		for(WebElement e : eleList ) {
			String eleText = e.getText();
			if(eleText.length() != 0) {
				eleTextList.add(eleText);
			}
		}
		return eleTextList;
	}
	
	public boolean doSearch(By searchField,By  suggestions, String searchKey, String matchValue) throws InterruptedException {
		
		boolean flag = false;
		doSendKeys(searchField,searchKey);
		Thread.sleep(3000);
		
		List<WebElement> suggList  = getElements(suggestions);
		
		int totalSuggestions = suggList.size();
		System.out.println("Total suggestions:"+ totalSuggestions);
		
		if( totalSuggestions == 0) {
			System.out.println("No suggestions found...");
			throw new FrameworkException("No suggestions found");
		}
		
		for(WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			
			if (text.contains(matchValue)) {
				e.click();
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println(matchValue + "The match is found");
			return true;
		}else
		{
			System.out.println(matchValue + "The match is found");
			return false;
		}}
		
		// *************** Actions Utils***************//
	
	public void doActionsClick(By locator) {
		act.click(getElement(locator)).perform();
	}
	
	public void doActionsSendKeys(By locator, String value) {
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public void doActionsSendKeysWithPause(By locator, String value, long pauseTime) {
		char ch[] = value.toCharArray();
		for (char c : ch) {
			act.sendKeys(getElement(locator), String.valueOf(c)).pause(pauseTime).perform();
		}
	}

		/**
		 * This method is handling two level of parent and child menu on the basis of By
		 * locator
		 * 
		 * @param parentMenu
		 * @param childMenu
		 * @throws InterruptedException
		 */
		public void ParentChildMenu(By parentMenu, By childMenu) throws InterruptedException {
			act.moveToElement(getElement(parentMenu)).perform();
			Thread.sleep(1500);
			doClick(childMenu);
		}

		public void ParentChildMenu(String parentMenu, String childMenu) throws InterruptedException {
			act.moveToElement(getElement(By.xpath("//*[text()='" + parentMenu + "']"))).perform();
			Thread.sleep(1500);
			doClick(By.xpath("//*[text()='" + childMenu + "']"));
		}

		/**
		 * This method is handling four levels of parent and child menu on the basis of By
		 * locator
		 * 
		 * @param parentMenu
		 * @param childMenu
		 * @throws InterruptedException
		 */
		public void ParentChildMenu(By level1, By level2, By level3, By level4) throws InterruptedException {
			doClick(level1);
			Thread.sleep(1000);
			act.moveToElement(getElement(level2)).perform();
			Thread.sleep(1000);
			act.moveToElement(getElement(level3)).perform();
			Thread.sleep(1000);
			doClick(level4);
		}
		// ***********wait utils********//

		/**
		 * An expectation for checking that an element is present on the DOM of a page.
		 * This does not necessarily mean that the element is visible on the page.
		 * 
		 * @param locator
		 * @param timeOut
		 * @return
		 */
		public WebElement waitForElementPresence(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}

		/**
		 * An expectation for checking that an element is present on the DOM of a page
		 * and visible on the page as well. Visibility means that the element is not
		 * only displayed but also has a height and width that is greater than 0.
		 * default polling time/interval time = 500ms
		 * @param locator
		 * @param timeOut
		 * @return
		 */
		public WebElement waitForElementVisible(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		public WebElement waitForElementVisible(By locator, int timeOut, int intervalTime) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofSeconds(intervalTime));
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		/**
		 * An expectation for checking an element is visible and enabled such that you can click it.
		 */
		public void waitForElementAndClick(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		}
		
		/**
		 * An expectation for checking that all elements present on the web page that match the locator are visible.
		 *  Visibility means that the elements are not only displayed but also have a height and width that is greater than 0.
		 * @param locator
		 * @param timeOut
		 * @return
		 */
		public List<WebElement> waitForElementsVisible(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}
		
		/**
		 * An expectation for checking that there is at least one element present on a web page.
		 * @param locator
		 * @param timeOut
		 * @return
		 */
		public List<WebElement> waitForElementsPresence(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		}
		
		
		public String getPageTitleIs(String expectedTitle, int timeOut) {
			if(waitForTitleIs(expectedTitle, timeOut)) {
				return driver.getTitle();
			}
			else {
				return "-1";
			}
		}
		
		public String getPageTitleContains(String expectedTitle, int timeOut) {
			if(waitForTitleContains(expectedTitle, timeOut)) {
				return driver.getTitle();
			}
			else {
				return "-1";
			}
		}
		

		public boolean waitForTitleIs(String expectedTitle, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.titleIs(expectedTitle));//if title is not matched, it will be throw timeOut exception
		}
		
		
		public boolean waitForTitleContains(String fractionTitle, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			try {
				return wait.until(ExpectedConditions.titleContains(fractionTitle));
			} catch (Exception e) {
				System.out.println("title is not matched");
				return false;
			}
		}
		
		
		public String waitForTitleContainsAndReturn(String fractionTitle, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			try {
				 wait.until(ExpectedConditions.titleContains(fractionTitle));
				 return driver.getTitle();
			} catch (Exception e) {
				System.out.println("title is not matched");
				return "-1";
			}
		}
			
		
		public String getPageURLContains(String fractionURL, int timeOut) {
			if(waitForURLContains(fractionURL, timeOut)) {
				return driver.getCurrentUrl();
			}
			else {
				return "-1";
			}
		}
			
		
		public boolean waitForURLContains(String fractionURL, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			try {
				return wait.until(ExpectedConditions.urlContains(fractionURL));//true
			} catch (Exception e) {
				System.out.println("URL is not matched");
				return false;
			}
			
		}
		
		
		public String waitForURLContainsAndReturn(String fractionURL, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			try {
				 wait.until(ExpectedConditions.urlContains(fractionURL));//true
				return driver.getCurrentUrl();
			} catch (Exception e) {
				System.out.println("URL is not matched");
				return "-1";
			}
		

		}}
