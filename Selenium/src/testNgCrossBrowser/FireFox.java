package testNgCrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFox {
  @Test
  public void testing() {
	  System.setProperty("webdriver.gecko.driver", "G:\\NewSelenium\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/login/");
	  
  }
}
