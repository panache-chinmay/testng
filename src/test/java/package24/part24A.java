package package24;

import org.testng.Assert;
import org.testng.annotations.Test;

public class part24A {
	
	
	@Test()
	public static void TestA() {
		
		int a = 10 ;
		int b = 0;
		
		try {
			int c =a/b;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Please enter the Appropraite number");
			//e.printStackTrace();
		}
	}
		
		
	@Test()
	public static void TestFailA() {
		Assert.fail();
	}
	
	@Test()
	public static void TestFailB() {
		Assert.fail("Fail the test case with message");
	}
	@Test()
	public static void TestFailC() {
		int a = 10 ;
		int b = 0;
		try {
			int c =a/b;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Please enter the Appropraite number");
			//e.printStackTrace();
			Assert.fail("Fail the test case with message",e);
		};
	}
	
	@Test(enabled = true , description = "The is description for enabled test case")
	public static void TestFailE() {
		System.out.println("Failed Test case");

	}
	
	@Test(invocationCount = 10)
	public static void TestInvo() {
		System.out.println("InnovacationCount TestCase");
		
	}
	
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public static void ExceptedException() {
		
		int a = 10 ;
		int b = 0 ;
		int c = 10/0;
		System.out.println("c");
		
	}
	                                  
	
	
	
		
	

}
