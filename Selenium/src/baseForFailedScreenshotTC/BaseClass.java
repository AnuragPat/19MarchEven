package baseForFailedScreenshotTC;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import testNgUtilityNew.UtilityProp;

public class BaseClass {
	
	protected static WebDriver driver;
	
	public void OpenBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver (2).exe");
		
		 driver=new ChromeDriver();
//		 driver.get("https://kite.zerodha.com/");
		 driver.get(UtilityProp.getDataFromPropertyFile("URL"));
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	}

}
