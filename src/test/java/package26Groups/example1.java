package package26Groups;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class example1 {
	
	@Test(groups = {"g1"})
	public static void customerUser() {
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.testfire.net/default.aspx");
		driver.findElement(By.linkText("ONLINE BANKING LOGIN")).click();
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234"+Keys.ENTER);
		String Pagetitle = driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(Pagetitle, "Hello John Smith","Pagetitle not matched");
		driver.close();
		
	}
	@Test(groups = {"g2"})
	public static void adminUser() {
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.testfire.net/default.aspx");
		driver.findElement(By.linkText("ONLINE BANKING LOGIN")).click();
		driver.findElement(By.id("uid")).sendKeys("admin");
		driver.findElement(By.id("passw")).sendKeys("admin"+Keys.ENTER);
		String Pagetitle = driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(Pagetitle, "Hello Admin User","Pagetitle not matched");
		driver.close();
	}

}
