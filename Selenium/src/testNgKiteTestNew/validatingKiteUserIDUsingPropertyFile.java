package testNgKiteTestNew;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testNgUsingBase.Base;
import testNgUtilityNew.UtilityProp;
import testNgWithKitePOM.KiteLoginPage;
import testNgWithKitePOM.KitePinPage;
import testNgWithKitePOM.KitehomePage;

public class validatingKiteUserIDUsingPropertyFile extends Base {
	KiteLoginPage login;
	KitePinPage pin;
	KitehomePage home;
	String TCID="0727";

	@BeforeClass
	public void launchBrowser() {
		OpenBrowser();// becoz of extends no need create obj
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
		home=new KitehomePage(driver);
		
	}
	@BeforeMethod
	public void loginToKite() throws IOException {
		login.SendUserName(UtilityProp.getDataFromPropertyFile("UN"));
		login.SendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
		login.ClickLogibButton();
		
		pin.sendPIN(UtilityProp.getDataFromPropertyFile("PIN"));
		pin.clickContinueButton();
		
	}
  @Test
  public void validateuserID() throws IOException {
	  Assert.assertEquals(home.getactualUserName(), UtilityProp.getDataFromPropertyFile("UN"));
	  UtilityProp.captureScreenShot(driver, TCID);
	  
  }
  @AfterMethod
  public void LogOutFromKite() throws InterruptedException {
	  home.LogOut();
	  
  }
  @AfterClass
  public void closeBrowser() {
	  driver.close();
  }
}
