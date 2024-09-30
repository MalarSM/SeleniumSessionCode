package mytest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGFeature {

	@BeforeSuite
	public void before() {
		System.out.println("BeforeSuite");
	}

	@Test
	public void first() {
		System.out.println("Test");
	}

	@Test
	public void Abc() {
		System.out.println("Abc");
	}

	@Test
	public void Abcd() {
		System.out.println("Abc");
	}

	@AfterTest
	public void After() {
		System.out.println("AfterSuite");
	}
}
