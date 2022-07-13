package kiteApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteUserIdTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://kite.zerodha.com/");
       Thread.sleep(1000);
       WebElement username = driver.findElement(By.id("userid"));
       WebElement pswd = driver.findElement(By.id("password"));
       WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
      
      username.sendKeys("ELR321");
      pswd.sendKeys("Dhana1111");
      loginButton.click();
      Thread.sleep(3000);
      
      WebElement PIN = driver.findElement(By.id("pin"));
      WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
      
      PIN.sendKeys("982278");
      continueButton.click();
      
      Thread.sleep(3000);
      
      WebElement UserID = driver.findElement(By.xpath("//span[@class='user-id']"));
      System.out.println(UserID.getText());
      
      String actualUserID = UserID.getText();
      String expectedUserID = "ELE3211";
      if(actualUserID==expectedUserID) {
    	  System.out.println("User ID is matching TC is PASSED");
      }
      else {
    	  System.out.println("User ID is not matching TC is FAILED");
      }
      
      
      UserID.click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//a[@target='_self']")).click();
      Thread.sleep(1000);
      driver.close();
      
      
	}
}
