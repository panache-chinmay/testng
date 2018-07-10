package package28;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class example2 {
	@Test
	public void searchTest() {
	System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.testfire.net/default.aspx");
	driver.findElement(By.id("txtSearch")).sendKeys("vikas" + Keys.ENTER);
	String pageTitle = driver.findElement(By.tagName("h1")).getText();
	Assert.assertEquals(pageTitle, "Search Results","SearchResultNotFound");
	String searchResult = driver.findElement(By.id("_ctl0__ctl0_Content_Main_lblSearch")).getText();
	Assert.assertEquals(searchResult, "vikas","vikas text not found");
	driver.quit();
	}
	
	@Test
	public void searchTesta() {
	System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.testfire.net/default.aspx");
	driver.findElement(By.id("txtSearch")).sendKeys("vikas" + Keys.ENTER);
	String pageTitle = driver.findElement(By.tagName("h1")).getText();
	Assert.assertEquals(pageTitle, "Search Results","SearchResultNotFound");
	String searchResult = driver.findElement(By.id("_ctl0__ctl0_Content_Main_lblSearch")).getText();
	Assert.assertEquals(searchResult, "vikas","vikas text not found");
	driver.quit();
	

}
}
