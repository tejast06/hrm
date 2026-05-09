package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard extends BasePage {
	
	public WebDriver driver;
	public DashBoard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement dashboard;
	
	public boolean  validateDashboardDisplayed() {
		return dashboard.isDisplayed();
	}

	

}
