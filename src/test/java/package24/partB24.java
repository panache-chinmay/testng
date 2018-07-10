package package24;

import org.testng.annotations.Test;

public class partB24 {
	
	
	// Priority and DependsOnMethod
	
@Test(priority = 5)
public static void TestA() {
	
	System.out.println("A");
	
}

@Test(priority = 2)
public static void TestB() {
	System.out.println("B");
}

@Test(priority = 3)
public static void TestC() {
	System.out.println("C");
}

@Test(priority = 4)
public static void TestD() {
	System.out.println("D");
}

@Test(priority = 1)
public static void TestE() {
	System.out.println("E");
}





	}
