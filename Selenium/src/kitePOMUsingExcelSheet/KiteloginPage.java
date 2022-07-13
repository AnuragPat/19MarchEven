package kitePOMUsingExcelSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteloginPage {
	
	
	//1.Variable
	@FindBy(id = "userid")private WebElement userName;
    @FindBy(id = "password")private   WebElement password;
	//@FindBy(xpath = "//input[@type='password']")private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LoginButton;
	
	//2.con
	public KiteloginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
   //3.method
	public void sendUserName(String UserName) {
		userName.sendKeys(UserName);
	}
	 
	public void sendPassWord(String PSWD) {
		password.sendKeys(PSWD);
	}
	public void ClickLogin() {
		LoginButton.click();
	}
	
	
	
	
}
