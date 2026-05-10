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
	
	@FindBy(xpath="//p[contains(@class,'oxd-userdropdown-name')]")
	WebElement userProfile;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logOut;
	
	public boolean  validateDashboardDisplayed() {
		return dashboard.isDisplayed();
	}
	
	public void clickOnLogout() throws InterruptedException {
		userProfile.click();
		Thread.sleep(2000);
		logOut.click();
		
	}

	

}
