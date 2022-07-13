package miscelleneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      
	      driver.get("https://www.google.com/");
	      driver.findElement(By.name("q")).sendKeys("honda");
	      Thread.sleep(200);
	      List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='erkvQe'])[1]//li"));
          System.out.println(searchResult.size());
          for(WebElement j:searchResult)//for getting text
        	  {
        	  System.out.println(j.getText());
          }
          
          for(WebElement k:searchResult)
          {
        	  String actualText=k.getText();
        	  String expectedText="honda amaze";
        	  if(actualText.equals(expectedText)) 
        	  {
        		k.click();
        		break;
        	  }
        			  
          }
          driver.findElement(By.linkText("Images")).click();
	}

}
