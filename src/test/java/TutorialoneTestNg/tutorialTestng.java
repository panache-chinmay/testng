package TutorialoneTestNg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tutorialTestng {
	

@BeforeMethod
public static void BeforeMethod(){
	System.out.println("Before Method");
}	
	
@AfterMethod
public static void AfterMethod(){
	System.out.println("After Method");
}

@Test(priority = 1,enabled = false)
public static void TestE() {
	System.out.println("Test E");
}

@Test(priority = 2,invocationCount = 10)
public static void TestF() {
	System.out.println("Test F");
}
@Test(priority = 3)
public static void TestG() {
	System.out.println("Test G");
}

@Test(description = "This test case is for login")
public static void Testqwe() {
	//System.out.println("Test Gi");
}

@Test()
public static void Test1() {
	//System.out.println("Test Gi");
	Assert.assertTrue(true);
}

@Test( )
public static void Test2() {
	//System.out.println("Test Gi");
	Assert.fail();
}

@Test(dependsOnMethods = {"Test2","Test1"})
public static void Test3() {
	//System.out.println("Test Giy");
}
@Test(expectedExceptions = {ArithmeticException.class})
public static void Test35() {
	int c = 10 / 0 ;
}







}
