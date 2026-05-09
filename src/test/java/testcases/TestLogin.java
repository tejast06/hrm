package testcases;




import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;
import pageobject.DashBoard;
import pageobject.LoginPage;


public class TestLogin extends BaseClass  {
	
	
	public WebDriver driver;
	public LoginPage loginPage;
	public DashBoard dashBoard;

	
	
	@Test
	void verifyLogin() {
		loginPage = new LoginPage(driver);
		dashBoard = new DashBoard(driver);
		loginPage.enterCreds("admin", "admin123");
		dashBoard.validateDashboardDisplayed();
		
		
	}

}
