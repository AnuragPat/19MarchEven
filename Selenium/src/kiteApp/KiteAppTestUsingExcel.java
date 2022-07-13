package kiteApp;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppTestUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		File myFile=new File("G:\\NewSelenium\\ExcelSheet2.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
         String UN = mySheet.getRow(0).getCell(0).getStringCellValue();
         String PSWD = mySheet.getRow(0).getCell(1).getStringCellValue();
         String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
         
         System.out.print(UN +" "+PSWD+" "+PIN);// to get value in console
         
         System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\Chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://kite.zerodha.com/");
         Thread.sleep(1000);
         driver.manage().window().maximize();
         
         WebElement UserName = driver.findElement(By.id("userid"));
         UserName.sendKeys(UN);
         WebElement Password = driver.findElement(By.id("password"));
         Password.sendKeys(PSWD);
         WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
          LoginButton.click();
         Thread.sleep(1000);
         
         WebElement pin = driver.findElement(By.id("pin"));
         pin.sendKeys(PIN);
         WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
         ContinueButton.click();
         Thread.sleep(2000);
         
        WebElement UserId = driver.findElement(By.xpath("//span[@class='user-id']")); 
         System.out.println(UserId);//------>getText  not written thats y console shows like that
         System.out.println(UserId.getText());//------->for compare---my understanding
         System.out.println("**********************************");
         
         
         String actualUserID = UserId.getText();
         String expectedUserID = UN;
         if(actualUserID.equals(expectedUserID)) {
        	 System.out.println("UserId is matching TC is PASSED .");
         }
         else {
        	System.out.println("UserId is not matching TC is FAILED  .");
         }
         
         UserId.click();
         driver.findElement(By.xpath("//a[@target='_self']")).click();
         Thread.sleep(1000);
         driver.close();
         
	}

}
