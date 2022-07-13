package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInSelenium {

	public static void main(String[] args) throws InterruptedException {
           System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
           WebDriver driver =new ChromeDriver();
           driver.get("https://vctcpune.com/selenium/practice.html");
           
           Thread.sleep(500);
           
           //1. normal scrolling   
           
            JavascriptExecutor e = (JavascriptExecutor)driver;
         //   e.executeScript("window.scrollBy(90,799)");
            
         //   e.executeScript("window.scrollBy(135,-799)");//need to check 
          //  e.executeScript("window.scrollBy(-90,799)");
         //   e.executeScript("window.scrollBy(-90,-799)");
            
            
          //2.Scroll into View  
           WebElement mouse = driver.findElement(By.id("mousehover")) ;
            e.executeScript("arguments[0].scrollIntoView(true)", mouse);
            
            
	}

}
