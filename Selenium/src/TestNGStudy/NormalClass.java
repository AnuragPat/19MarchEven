package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NormalClass {
  @Test
  public void Example1TestNG() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://kite.zerodha.com/");
	   Thread.sleep(500);
	   driver.manage().window().maximize();
	   
	   
	   
	   System.out.println("Hi this is reporter output");
	   Reporter.log("Hi this is reporter output");
	   Reporter.log("Hi this is reporter output",true);
  }
}
