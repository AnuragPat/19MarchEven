package testNGPractice;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebookPOM.loginPage;
import testNgUsingBase.BaseFacebook;
import testNgUsingUtility.UtilityFacebook;

public class testNgForFacebook extends BaseFacebook {
	loginPage home;
	String ID="5538";
	
	@BeforeClass
	public void launchBrower() throws IOException {
		openBrowser();
		home=new loginPage(driver);
		
	}
	@BeforeMethod
	public void loginToFacebbok() throws IOException {
		home.sendEmailID(UtilityFacebook.readDataFromPropertyFile("EmailID"));
		home.sendPassword(UtilityFacebook.readDataFromPropertyFile("PSWD"));
		home.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
  @Test
  public void f() throws IOException {
	  UtilityFacebook.captureScreenshot(driver, ID);
  }
  @AfterMethod
	public void Brower() {
		
	}
  @AfterClass
	public void closeBrower() {
		
	}
}
