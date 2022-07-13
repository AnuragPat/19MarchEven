package TestNGStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
	
	@BeforeClass
	  public void LaunchBrowser() {
		  Reporter.log("Launching browser",true);
		  
	  }
	
	
	@BeforeMethod
	  public void LoginToKiteApp() {
		  Reporter.log("Login success",true);
	  }
	  
	  
    @Test
      public void validateUserName() {
    //	Assert.fail();
	  Reporter.log("User name validate",true);
      }
  
 
  @AfterMethod
  public void LogOutFromKiteApp() {
	  Reporter.log("Logged out....",true);
  }
  
  
  @AfterClass
  public void CloseBrowser() {
	  Reporter.log("Closing browser..",true);
  }
}
