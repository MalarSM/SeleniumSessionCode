package mytest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityTest {

	@BeforeTest
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority =1)
	public void test2() {
		System.out.println("test2");
	}
}
