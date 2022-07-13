package testNgWithKitePOM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteUserName {
	WebDriver driver;
	Sheet mySheet;
	KiteLoginPage login;
	KitePinPage pin;
	KitehomePage home;
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver (2).exe");
	    driver = new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
	    Reporter.log("Launching browser",true);
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    File myFile=new File("G:\\NewSelenium\\ExcelSheet2.xlsx");
	    mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
	    login =new KiteLoginPage(driver);
	    pin=new KitePinPage(driver);
	    home=new KitehomePage (driver);
	    
	}
	@BeforeMethod
	public void LoginToKiteApp() {
		String UN=mySheet.getRow(0).getCell(0).getStringCellValue();
		String PWD=mySheet.getRow(0).getCell(1).getStringCellValue();
		String PIN=mySheet.getRow(0).getCell(2).getStringCellValue();
		login.SendUserName(UN);
		Reporter.log("sending username",true);
		login.SendPassword(PWD);
		Reporter.log("sending Password",true);
		login.ClickLogibButton();;
		Reporter.log("clicking on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPIN(PIN);
		Reporter.log("sending pin",true);
		pin.clickContinueButton();
		Reporter.log("Clicking on continue button ",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
  @Test
  public void validateUserName() {
	  String ActualUN=home.getactualUserName();
	  String ExpectedUN=mySheet.getRow(0).getCell(0).getStringCellValue();
	  Reporter.log("Validating userName",true);
	  Assert.assertEquals(ActualUN, ExpectedUN,"TC is failed expected and actual values are not matching");
	  Reporter.log("TC is Passed expected and actual values are matching",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  
  @AfterMethod
  public void LogOutFromKite() throws InterruptedException {
	  home.LogOut();
	  Reporter.log("Logging out..",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @AfterClass
  public void closeBrowser() {
	  Reporter.log("Closing browser...",true);
	  driver.close();
  }
}
