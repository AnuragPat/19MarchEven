package facebookPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	//variable
	@FindBy(id = "email")private WebElement Email;
    @FindBy(id="pass")private WebElement Password;
    @FindBy(id = "loginbutton")private WebElement loginButton;
    
    //Constructor
    public loginPage (WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    public void sendEmailID(String email) {
    	Email.sendKeys(email);
    }
    
    public void sendPassword(String password ) {
    	Password.sendKeys(password);
    }
    
    public void clickOnLoginButton() {
    	loginButton.click();            ;
    }
}
