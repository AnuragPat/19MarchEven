package testNGPractice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing {
  @Test
  public void loginPage() throws EncryptedDocumentException, IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver (2).exe");
	  WebDriver driver=new ChromeDriver(); 
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();
	  
	  
	  File f=new File("G:\\NewSelenium\\ExcelSheet2.xlsx");
	 Sheet MySheet = WorkbookFactory.create(f).getSheet("sheet2");
	 String ID = MySheet.getRow(3).getCell(0).getStringCellValue();
	 String PSWD = MySheet.getRow(3).getCell(1).getStringCellValue();
	 
//	 System.out.println("Email id is "+ID);
//	 System.out.println("Password is "+PSWD);
	 Reporter.log("Email id is "+ID,true);
	 Reporter.log("Password is "+PSWD,true);
	 
	 
	  WebElement Email = driver.findElement(By.id("email"));
	  Email.sendKeys(ID);
	  
	  WebElement Password = driver.findElement(By.id("pass"));
	  Password.sendKeys(PSWD);
	  
	  
	  Thread.sleep(500);
	  WebElement Loginbutton = driver.findElement(By.id("loginbutton"));
	  Loginbutton.click();
	  Thread.sleep(500);
	  driver.close();
	  
	  
	  
	  
	
  }
}
