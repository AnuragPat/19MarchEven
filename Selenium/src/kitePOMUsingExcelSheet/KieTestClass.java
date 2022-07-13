package kitePOMUsingExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KieTestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		File mm=new File("G:\\NewSelenium\\ExcelSheet2.xlsx");
	//	new File("G:\\NewSelenium\\My first Excel Sheet.xlsx");
       Sheet mysheet = WorkbookFactory.create(mm).getSheet("Sheet1");
      String USER = mysheet.getRow(0).getCell(0).getStringCellValue();
      String PSWD = mysheet.getRow(0).getCell(1).getStringCellValue();
      String PINE = mysheet.getRow(0).getCell(2).getStringCellValue();
      System.out.println(USER +""+PSWD+""+PINE);
      
       System.setProperty("webdriver.chrome.driver","G:\\NewSelenium\\chromedriver.exe");
       
       ChromeOptions opt=new ChromeOptions();
     //  opt.addArguments("--disable-notifications");// i don't want notification
     // opt.addArguments("--headless");
       opt.addArguments("--incognito");
       
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
      
       KiteloginPage n=new KiteloginPage(driver);
       n.sendUserName(USER);//sendUserName
       n.sendPassWord(PSWD);//sendPassWord
       n.ClickLogin();
       
       Thread.sleep(1000);
       KitePinPage p=new KitePinPage(driver);
       p.sendPIN(PINE);// SendPIN
       p.ContinueButton();
       
      
       Thread.sleep(1000);
       KiteHomePage h=new KiteHomePage(driver);
       h.username(USER);
       h.clickLogOut();
       
       Thread.sleep(1000);
       driver.close();
      
	}

}
