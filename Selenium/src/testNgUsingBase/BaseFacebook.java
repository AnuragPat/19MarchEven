package testNgUsingBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import testNgUsingUtility.UtilityFacebook;



public class BaseFacebook {
	
	protected static WebDriver driver;
	
	public void openBrowser() throws IOException {
		System.setProperty("webdriver.gecko.driver", "G:\\NewSelenium\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get(UtilityFacebook.readDataFromPropertyFile("URL"));
	}

}
