package kitePOMUsingExcelSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	//1.
	@FindBy(xpath = "//span[@class='user-id']")private WebElement UserName; 
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogOutButton;
	
	
	//2.con
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	public void username(String ExpectedUserID) throws InterruptedException {
		String expectedUserName=ExpectedUserID;
		String actualUserName=UserName.getText();
		
		    if(expectedUserName. equals(actualUserName)) 
		    {
		    	System.out.println("UserId is matching TC is Pass");
		    }
		
		    else {
		    	System.out.println("UserId not matching TC is fail");
		    }
		    UserName.click();
			Thread.sleep(1000);
	}	
	
	public void clickLogOut() throws InterruptedException {
		
		LogOutButton.click();
	}
	
}
