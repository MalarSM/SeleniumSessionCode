package seleniumsessions;

import org.openqa.selenium.By;

public class CustomCssSelector {

	public static void main(String[] args) {
		
		//CSS: Cascaded style sheet
		//cssSelector is a locator
		
		By.cssSelector("");
		
		//if id is available
		//its start with #id
		//#input-email
		//tag#id
		//input#input-email
		
		//if class attribute is available
		//.classname
		//.form-class
		//input.form-control - tagname.form-control
		
		//.c1.c2.c3...cn
		//input.c1.c2.c3...cn
		
		
		//id and class together:
		//#id.class
		
		//.class#id
		//tagname.class#id
		//tag.c1#id.c2.c3
		
		//for any attribute in csselector
		//  tagname[attr='value']
		//input[name='email']
		
		//input[name='email'] --css
		//input[@name='email'] --xpath
		
		//text in CSS : No support for text in CSS
		
		//Contains in CSS:
		//tag[attr *='value']
		// input[placeholder *='E-mail']
		
		//starts with in CSS:
		//tag[attr ^='value']
		// input[placeholder ^='E-mail']
		
		//ends-with:
		//tag[attr $='value']
		// input[placeholder $='Email']
		
		//parent to child:
		// parenttag childtag: indirect child elements
		// form#hs-login input#username
		
		// parenttag > childtag: direct child elements
		//form#hs-login > div
		// select#Form_getForm_Country > option
		// select#Form_getForm_Country > option[value='Afghanistan']
		// footer a 
		
		//By.cssSelector("footer a");
		
		//child to parent: Backward traversing is  not allowed with css
		
		//sibling in Css:[Preceding sibiling is not allowed]
		//following sibling +
		//labal[for=''input-email'] + input --only immediate following sibling
		// select#Form_getForm_Country > option[value='Afghanistan'] ~ option == for all following sibling

	}

}
