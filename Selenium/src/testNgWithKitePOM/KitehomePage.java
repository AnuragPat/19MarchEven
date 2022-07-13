package testNgWithKitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitehomePage {
	
	@FindBy(xpath = "//span[@class='user-id']")private WebElement UserName;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogOutButton;//a[@target='_self']
	
	//
	public KitehomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void validateUserName(String expectedUserId) {
		String actualUserName=UserName.getText();
		String expectedUserName=expectedUserId;
		
	/*	if(expectedUserName.equals(actualUserName)) {
			System.out.println("Actual and Expected matching TC is Passed .");
		}
		else {
			System.out.println("Actual and Expected values are not matching TC is Failed");
		}
	*/}
	
	// to get actual userName-------------->mhnun design kela aahe
	public String getactualUserName()
	{
		String actualUserName=UserName.getText();
		return actualUserName;
	}
	 
	public void LogOut() throws InterruptedException {
		UserName.click();
		Thread.sleep(500);
		LogOutButton.click();
		
	
	
	}
}
