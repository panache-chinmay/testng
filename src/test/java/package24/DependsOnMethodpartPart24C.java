package package24;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodpartPart24C {
	
	
	@Test()
	public static void TestB() {
		System.out.println("TestB");
		Assert.fail();
	}
	
	@Test()
	public static void TestA() {
		System.out.println("TestA");
	}
	
	@Test(dependsOnMethods = {"TestA","TestB"})
	public static void dependMethod() {
		System.out.println("A and B dependOnmethod");
		
	}

}
