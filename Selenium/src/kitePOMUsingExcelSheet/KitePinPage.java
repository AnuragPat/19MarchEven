package kitePOMUsingExcelSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	@FindBy(id = "pin")private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;
	
	//2.con
	public KitePinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3.
	public void sendPIN(String Pin) {
		PIN.sendKeys(Pin);
	}
	
	public void ContinueButton() {
		ContinueButton.click();
	}
	
	
	
	
	
	
	
}
