package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations_heirarchy {
	@Test
	public void test() {
		System.out.println("Im test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Im beforemethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Im aftermethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Im beforeclass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Im afterclass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Im beforetest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Im aftertest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Im beforesuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Im aftersuite");
	}

}
