package testNgCrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
//	WebDriver driver=null;
	
	@Parameters("browserName")
	
  @Test
  public void myMethod (String name) throws InterruptedException {
		WebDriver driver=null;
		
		if(name.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "G:\\NewSelenium\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
			
		
		else if(name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver (2).exe");
		    driver=new ChromeDriver();
			
		}
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
	//	driver.close();
	
  }
}
