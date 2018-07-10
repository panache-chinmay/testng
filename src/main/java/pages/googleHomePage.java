package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class googleHomePage extends BasePage {
	
	public googleHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name ="q")
	WebElement  searchBox;
	
	public void SearchBox( String SearchText) {
		searchBox.sendKeys(SearchText);
	}
	
	

}
