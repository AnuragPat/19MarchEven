package miscelleneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://vctcpune.com/selenium/practice.html");
      List<WebElement> links = driver.findElements(By.tagName("a"));
      System.out.println(links.size());
      Iterator<WebElement> it = links.iterator();
      System.out.println("==========================");
      while(it.hasNext()) {
    	  System.out.println(it.next().getText());
      }
	}

}
