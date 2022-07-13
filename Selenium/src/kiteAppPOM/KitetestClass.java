package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KitetestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		KiteLoginPage login=new KiteLoginPage(driver);
		login.sendUserName();
		login.sendPassword();
		login.ClickLoginButton();
		
		Thread.sleep(1000);
		KitePinPage pin=new KitePinPage(driver);
		pin.sendPIN();
		pin.ClickOnContinueButton();
		
		Thread.sleep(1000);
		KiteHomePage home=new KiteHomePage(driver);
		home.validateUserName();
		home.LogOut();
		
		
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
