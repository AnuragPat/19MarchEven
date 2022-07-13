package popUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPoUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://skpatro.github.io/demo/links/");
	    Thread.sleep(500);
	    String mainPageID = driver.getWindowHandle();
	    System.out.println(mainPageID);
        System.out.println("===========================================");
        
	  //to open child window
	    driver.findElement(By.name("NewWindow")).click();
	  //to handle multiple windows/ to get multiple id's
	    Set<String> allPageId = driver.getWindowHandles();
	  //  System.out.println(allPageId);
	    
	     Iterator<String> it = allPageId.iterator();
	  //   while(it.hasNext()) {
	  //  	 System.out.println(it.next());
	  //   }
	   
	  String mainPageId=it.next();//will return main page id
	  String childPageId=it.next();// will return child page id 
	 // switch focus from main to child window
	  driver.switchTo().window(childPageId);
	  driver.manage().window().maximize();
	  driver.findElement(By.id("the7-search")).sendKeys("Selenium");
	  Thread.sleep(1000);
	 // driver.close();// will close only current focused tab
	// driver.quit();// will close all tabs/pages opened by selenium
	  driver.switchTo().window(mainPageId);
	  driver.manage().window().maximize();
	  WebElement text = driver.findElement(By.xpath("//p[text()='Click below to open link in new browser window']"));
	  System.out.println(text.getText());
	}

}
