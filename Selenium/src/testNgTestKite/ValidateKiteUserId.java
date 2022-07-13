package testNgTestKite;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testNgUsingBase.Base;
import testNgUsingUtility.Utility;
import testNgWithKitePOM.KiteLoginPage;
import testNgWithKitePOM.KitePinPage;
import testNgWithKitePOM.KitehomePage;

public class ValidateKiteUserId extends Base {
	KiteLoginPage login;
	KitePinPage pin;
	KitehomePage home;
	
	@BeforeClass
	public void launchBrowser() {
		OpenBrowser();
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver); 
	    home=new KitehomePage(driver);
	}
	@BeforeMethod
     public void loginToKiteApp() throws EncryptedDocumentException, IOException {
		login.SendUserName(Utility.readDataFromExcel(0, 0));
		login.SendPassword(Utility.readDataFromExcel(0, 1));
		login.ClickLogibButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPIN(Utility.readDataFromExcel(0, 2));
		pin.clickContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}	
  @Test
  public void validateUserID() throws EncryptedDocumentException, IOException {
	  Assert.assertEquals(home.getactualUserName(), Utility.readDataFromExcel(0, 0),"TC is Failed actual & expected values are different");
	  
  }
  @AfterMethod
  public void LogOutFromKite() throws InterruptedException {
	  home.LogOut();
  }
  @AfterClass
  public void closeBrower() {
	  driver.close();
	  
  }
}
