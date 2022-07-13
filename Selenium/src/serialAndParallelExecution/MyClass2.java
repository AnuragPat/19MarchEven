package serialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass2 {
  @Test
  public void mymethod1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://www.google.com/");
	   Thread.sleep(500);
	   
	  
	  
	  
  }
}
