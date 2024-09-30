package uitest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
  @Test
  public void pageTitleTest() {
	  driver.get("https://google.com");
	  String actualTitle = driver.getTitle();
	  System.out.println(actualTitle);
	  Assert.assertEquals(actualTitle, "Google");
  }
  
  @Test
  public void pageGetURL() {
	  String actualURL = driver.getCurrentUrl();
	  System.out.println(actualURL);
	  Assert.assertTrue(actualURL.contains("Google"));
  }
}
