package testNgUsingBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	 protected WebDriver driver;
	 
	public void OpenBrowser() { 
	System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver (2).exe");
	//System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver (2).exe");
	 driver=new ChromeDriver();
	 driver.get("https://kite.zerodha.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	}

}
