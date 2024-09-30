package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtil Br = new BrowserUtil();
		Br.intiBrowser("chrome");
		Br.enterUrl("https://www.google.com");
	   String title = Br.getPageTitle();
	   System.out.println(title);
	   if(title.toLowerCase().contains("google")) {
		   System.out.println("Testcase pass..");
	   }else {
		   System.out.println("Testcase failed..");
	   }
		   
	    Br.browserQuit();
	}

}
