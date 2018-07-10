package package27;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class package27configurationclasss {
	
	@BeforeSuite
	public static void BeforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public static void BeforeTest() {
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("BeforeClass");
		
	}
	@BeforeMethod
	public static void BeforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@Test
	public static void test() {
		System.out.println("Test");
	}
	
	@AfterSuite
	public static void AfterSuite() {
		System.out.println("BeforeSuite");
	}
	
	@AfterTest
	public static void AfterTest() {
		System.out.println("AfterTest");
	}
	@AfterClass
	public static void AfterClass() {
		System.out.println("AfterClass");
		
	}
	@AfterMethod
	public static void AfterMethod() {
		System.out.println("AfterMethod");
	}
	
	
	
	
	

}
