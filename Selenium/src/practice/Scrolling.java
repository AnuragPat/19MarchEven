package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
  
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://vctcpune.com/");
        Thread.sleep(3000);
        
        WebElement media = driver.findElement(By.xpath("//h1[text()='Our Social Media']"));
         JavascriptExecutor m = (JavascriptExecutor)driver;
	     m.executeScript("arguments[0].scrollIntoView(true)",media );
	
	
	
	}
	
}
