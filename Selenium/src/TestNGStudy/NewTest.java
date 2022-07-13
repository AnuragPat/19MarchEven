package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void myClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://kite.zerodha.com/");
	   Thread.sleep(500);
	   
	   System.out.println("Hi this is reporter output");
	  Reporter.log("Hi this is reporter output");
	  Reporter.log("Hi this is Reporter output",true);
  }
  
  @Test
  public void myClass2() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://vctcpune.com/");
	   Thread.sleep(500);
	   
	  
  }
}
