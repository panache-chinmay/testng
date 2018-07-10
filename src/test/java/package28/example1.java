package package28;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class example1 {
	
	public static  WebDriver driver ;
	
	
	@AfterMethod()
	public static void  tearDown(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
		SnapUtils.takeScreenshotonFail(driver,result.getMethod().getMethodName());
		}
		driver.close();
		
	}
	
	@Test
	public static void customerUser() {
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://demo.testfire.net/default.aspx");
		driver.findElement(By.linkText("ONLINE BANKING LOGIN")).click();
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234"+Keys.ENTER);
		String Pagetitle = driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(Pagetitle, "Hello JohSmith","Pagetitle not matched");
		
		
	}
	
	@Test
	public static void customerUserb() {
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://demo.testfire.net/default.aspx");
		driver.findElement(By.linkText("ONLINE BANKING LOGIN")).click();
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234"+Keys.ENTER);
		String Pagetitle = driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(Pagetitle, "Hello JohSmith","Pagetitle not matched");
		
		
	}
	@Test
	public static void customerUsera() {
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://demo.testfire.net/default.aspx");
		driver.findElement(By.linkText("ONLINE BANKING LOGIN")).click();
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234"+Keys.ENTER);
		String Pagetitle = driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(Pagetitle, "Hello JohSmith","Pagetitle not matched");
		
		
	}
	
	@Test
	public static void adminUser() {
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://demo.testfire.net/default.aspx");
		driver.findElement(By.linkText("ONLINE BANKING LOGIN")).click();
		driver.findElement(By.id("uid")).sendKeys("admin");
		driver.findElement(By.id("passw")).sendKeys("admin"+Keys.ENTER);
		String Pagetitle = driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(Pagetitle, "Hello Admin User","Pagetitle not matched");
		
	}
	
	
	
}
