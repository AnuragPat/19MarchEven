package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing1 {
  @Test
  public void myMethod1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://vctcpune.com/");
	  driver.manage().window().maximize();
	  
	  
	   String text = driver.findElement(By.xpath("//h2[text()='Start Practicing Now']")).getText();
	  System.out.println("Text is "+text);
	  
	//  <<<<<<<<<<<<<<<<<<<<<<< assertEqual() >>>>>>>>>>>>>>>>>>>>>>>>>>
	  String actual="Start Practicing Now";
	  String expected=text;
	  Assert.assertEquals(expected, actual,"TC is fail values are different");
	  Reporter.log("TC is passed ",true);
	  
	  //<<<<<<<<<<<<<<<<<<<<<<<<< assertNotEual() >>>>>>>>>>>>>>>>>>>>>>>>>
	  String Actual="Start Practicing Now";
	  String Expected="start practicing";
//	  Assert.assertNotEquals(Actual, Expected,"TC is fail values are matching");
	  Assert.assertNotEquals(expected, actual,"TC is fail values are different");
	  Reporter.log("TC is failed values are not matching ",true);
	  

	   
	  
  }
 
}
