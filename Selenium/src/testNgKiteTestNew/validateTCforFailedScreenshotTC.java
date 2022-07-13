package testNgKiteTestNew;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseForFailedScreenshotTC.BaseClass;

import testNgUtilityNew.UtilityProp;
import testNgWithKitePOM.KiteLoginPage;
import testNgWithKitePOM.KitePinPage;
import testNgWithKitePOM.KitehomePage;

@Listeners(listnerStudy.Listener.class)

public class validateTCforFailedScreenshotTC extends BaseClass{
	KiteLoginPage login;
	KitePinPage pin;
	KitehomePage home;
	
	@BeforeClass
	public void LaunchBrower() throws IOException {
		OpenBrowser();
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
		home=new KitehomePage(driver);	
	}
	
	@BeforeMethod
	public void loginToKite() throws IOException {
		login.SendUserName(UtilityProp.getDataFromPropertyFile("UN"));// no need to create mutiple
		login.SendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
		login.ClickLogibButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		pin.sendPIN(UtilityProp.getDataFromPropertyFile("PIN"));
		pin.clickContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));	
	}
  @Test
  public void validateUserID1001 () throws IOException {
	  Assert.assertEquals(home.getactualUserName(), UtilityProp.getDataFromPropertyFile("UN"));
	  Assert.fail();//here we usethis method becoz of listner failure madhe screenshot pahij
  }
  @AfterMethod
	public void logOutFromKite() throws InterruptedException {
	  home.LogOut();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));	
		
	}
  
  @AfterClass
	public void CloseBrower() {
	  driver.close();
		
	}
}
