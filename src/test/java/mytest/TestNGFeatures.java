package mytest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGFeatures {
	
	@BeforeSuite
	public void test() {
		System.out.println("Test");
	}
	
	@BeforeTest
	public void test1() {
		System.out.println("Test");
	}

}
