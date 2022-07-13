package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(1000);
       WebElement Day = driver.findElement(By.id("day"));
        Actions act=new Actions(driver);
        //1st element
        act.click(Day).perform();
        for(int i=0;i<=5;i++) {
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        }
        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        
        
       //2nd element
       WebElement month = driver.findElement(By.name("birthday_month"));
        act.click(month).perform();
        for(int i=0;i<=2;i++) {
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        }
        act.sendKeys(Keys.ENTER).perform();
        
        
        
	}
}
