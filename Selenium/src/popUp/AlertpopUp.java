package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertpopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.findElement(By.id("alertButton")).click();//after click alert popup comes
		
		//1.To handle alert popup we need to switch focus from main page to alert popup using syntax
		Alert yog=driver.switchTo().alert();
	
		
		//2.Alert is an interface contains all abstract methods like a.accept(), b.dismiss(), c.getText();
		System.out.println(yog.getText());
		Thread.sleep(1000);
		yog.accept();
	//	yog.dismiss();
		
        //	 Thread.sleep(1000);   //*****2nd point comment krun ha run karane
		//driver.switchTo().alert().accept();//we can do without creating obj of alert interface
		//  driver.switchTo().alert().dismiss();	
		//  driver.switchTo().alert().getText();
		//	System.out.println(getText());// obj not created then wedon't get text in console
			
             
	}

}
