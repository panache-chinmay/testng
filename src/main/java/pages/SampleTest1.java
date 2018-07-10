package pages;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class SampleTest1 extends BaseTest {
	
	
	@Test
	public static void searchText() {
		
		driver().get("https://www.google.com");
		driver().findElement(By.name("q")).sendKeys("Vikas");
		driver().findElement(By.name("q")).submit();
		String pageUrl = driver().getCurrentUrl();
		Assert.assertTrue(pageUrl.startsWith("https://www.google.com/search"),"Matching String not found");
		
	}

}
