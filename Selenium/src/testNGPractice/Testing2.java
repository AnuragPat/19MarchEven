package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing2 {
  @Test
  public void myMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  Thread.sleep(500);
	  String Emailaddress = driver.findElement(By.id("email")).getText();
 //      Emailaddress2 = driver.findElement(By.id("email")).sendKeys(null);
	  System.out.println("Email is "+Emailaddress);
	  Assert.assertNull(Emailaddress, "TC is failed value is not null");
	  Reporter.log("TC is passed value is null ",true);
  }
}
