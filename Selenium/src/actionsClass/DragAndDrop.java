package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(200);
        //1.find source and destination Elements
      // WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
       WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
       Thread.sleep(1000);
         WebElement destination = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[5]"));
        
        //2.create obj of action class
         Actions act=new Actions(driver);
         
       //3.using Cascaded methods  
         act.moveToElement(src).clickAndHold().moveToElement(destination).release().build().perform();
        
        
	}

}
