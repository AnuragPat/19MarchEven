package seleniumStudy1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
      // driver.get("https://www.google.com");----->work hote
       //Thread.sleep(5000);
      // driver.close();
      driver.get("https://vctcpune.com/");	
      Thread.sleep(1000);
     // driver.close();
      
     //  driver.findElement(By.xpath("//label[@for='radio1']")).click();
	}
}