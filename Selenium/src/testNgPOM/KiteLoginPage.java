package testNgPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	// data mem
	 @FindBy(id="userid")private WebElement userName;
     @FindBy(id = "password")private   WebElement password;
     @FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;

     // costructor
   public KiteLoginPage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
	   
   }
  // methods
   public void SendUserName(String UserName) {
	   userName.sendKeys(UserName);
   }
   public void SendPassword(String PSWD) {
	   password.sendKeys(PSWD);
   }
   public void ClickLogibButton() {
	  loginButton.click();
   }
}
