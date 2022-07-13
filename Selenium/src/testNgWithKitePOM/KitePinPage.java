package testNgWithKitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
 //Variable 	
  @FindBy(id = "pin") private WebElement  PIN;
  @FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;
  
  
  //con
  public KitePinPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  
  //Methods
  public void sendPIN(String Pin) {
	  PIN.sendKeys(Pin);
  }
  public void clickContinueButton() {
	  ContinueButton.click();
  }
  
  
}
