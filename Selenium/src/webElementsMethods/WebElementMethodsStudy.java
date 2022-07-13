package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
         driver.get("https://mail.google.com/mail/u/0/#inbox");
         Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Shravya@123");
        Thread.sleep(1000);
        
        
        //2. Clear():This method is use to clear value in the text field.
      // driver.findElement(By.xpath("//input[@type='email']")).clear();)
	}
	
}
