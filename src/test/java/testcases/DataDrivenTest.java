package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.DashBoard;
import pageobject.LoginPage;

public class DataDrivenTest extends BaseClass {
	
	public WebDriver driver;
	public LoginPage loginPage;
	public DashBoard dashBoard;
	
	@Test(dataProvider = "LoginData",dataProviderClass = DataProvider.class)
	void verifyDataDriven(String name,String pw,String exp) throws InterruptedException {
		loginPage = new LoginPage(driver);
		dashBoard = new DashBoard(driver);
		loginPage.enterCreds(name, pw);
		
		boolean targetPage = dashBoard.validateDashboardDisplayed();
		
		if(exp.equalsIgnoreCase("pass")) {
			if(targetPage=true) {
				Assert.assertTrue(targetPage);
				dashBoard.clickOnLogout();
				Assert.assertTrue(true);
				
			}
			else {
				Assert.assertTrue(false);
			}
		}
		if(exp.equalsIgnoreCase("fail")) {
			if(targetPage=true) {
				dashBoard.clickOnLogout();
				Assert.assertTrue(false);
				
			}
			else {
				Assert.assertTrue(true);
			}
		}
		
		
		
	}
	
	

}
