package practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUp {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","G:\\NewSelenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
       driver.get("https://skpatro.github.io/demo/links/");
       Thread.sleep(500);
       String mainPageID = driver.getWindowHandle();
       System.out.println(mainPageID);
       System.out.println("===================================");
       Thread.sleep(1000);
       //to open child window
	    driver.findElement(By.name("NewWindow")).click();
	    
	  //to handle multiple windows/ to get multiple id's
       Set<String> allPageId = driver.getWindowHandles();
       System.out.println(allPageId);
       System.out.println("=====================================");
       Thread.sleep(1000);
      ArrayList<String> al = new ArrayList<String>(allPageId);   //using arraylist//import arraylist
      System.out.println(al.get(0));
      System.out.println(al.get(1));
      Thread.sleep(400);
      driver.switchTo().window((String) al.get(1));
	  driver.manage().window().maximize();
	  driver.findElement(By.id("the7-search")).sendKeys("Selenium");
	  Thread.sleep(1000);
	// driver.close();// will close only current focused tab
	// driver.quit();// will close all tabs/pages opened by selenium
		  driver.switchTo().window(al.get(0));
		  driver.manage().window().maximize();
		  WebElement text = driver.findElement(By.xpath("//p[text()='Click below to open link in new browser window']"));
		  System.out.println(text.getText());
		  driver.quit();
      
   
       
	}
	
}
