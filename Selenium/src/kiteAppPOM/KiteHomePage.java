package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
    
	
	//1.variable
	@FindBy(xpath = "//span[@class='user-id']")private WebElement UserName; 
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogOutButton;
	
	//2.con
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods
	public void validateUserName() {
      String expectedUserName="ELR321";
      String actualUserName=UserName.getText();
    
        if(expectedUserName. equals(actualUserName))
        {
        	System.out.println("Actual & Expected User Id matching TC is PASS");
        	
        }
        
	    else 
	    {
		System.out.println("Actual & Expected User Id NOT matching TC is FAIL");
	    }
	}
	
	public void LogOut() throws InterruptedException 
	{
		UserName.click();
		Thread.sleep(1000);
		LogOutButton.click();
	}
	
	
	
	
	
	
}
 