package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	private static WebDriver driver ;
	
	@BeforeMethod
	public  static void Setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/chinmaydeshpande/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public static void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}

	protected static WebDriver driver() {
		return driver;
	} 

}
