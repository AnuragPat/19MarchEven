package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		driver.switchTo().frame("iframe-name");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		
      
        
        //a[text()='About us'])[1]
	}

}
