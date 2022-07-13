package testNgKiteBaseNew;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import testNgUtilityNew.UtilityProp;

public class BaseNew {
	protected WebDriver driver;
	
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.get(UtilityProp.getDataFromPropertyFile("URL"));
		Reporter.log("Launching browser suceefully",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
	}
	

}
