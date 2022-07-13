package miscelleneousPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.google.com/");
	      driver.findElement(By.name("q")).sendKeys("Range rover");
	      Thread.sleep(200);
           List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='erkvQe'])[1]//li"));
           System.out.println(result.size());
           
           
           for(WebElement m:result)    // for get text
           {
        	   System.out.println(m.getText());
           }
           
           for(WebElement j:result) {
        	   String actualResult=j.getText();
        	   String expectedResult="range rover evoque";
        	   if(actualResult.equals(expectedResult)) 
        	   {
        		   j.click();
        		   break;
        	   }
           }
         //  driver.findElement(By.linkText("Images")).click();
           driver.findElement(By.linkText("Images")).click();
           System.out.println("=================================");
           
          List<WebElement> NoOfImages = driver.findElements(By.tagName("img"));
          System.out.println("no of images are "+NoOfImages.size());
	}

}
