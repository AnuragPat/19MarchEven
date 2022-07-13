package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEg1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
		//1.create obj of actions class & pass Webdriver object
		Actions act=new Actions(driver);
		
		//2.identify element where action to be perform
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		//*1st method actions class method perform desired operation
		//act.moveToElement(rightClickButton).perform();//-->moved mouse to desired location
		//act.contextClick().perform();//---->perform right click operation
		
		//*2nd method
		//act.moveToElement(rightClickButton).contextClick().build().perform();
		
		//*3rd method
		//act.contextClick(rightClickButton).perform();
		
		
	//	Click on webElement using actions class method
		WebElement Selenium = driver.findElement(By.linkText("Selenium"));
		//act.click(Selenium).perform();
       // act.moveToElement(Selenium).click().build().perform();
        
   //   double click using Actions class
        WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
    //	act.moveToElement(DoubleClick).doubleClick().build().perform();
	    act.doubleClick(DoubleClick).perform();
	
	}

}
