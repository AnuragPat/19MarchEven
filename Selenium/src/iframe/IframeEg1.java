package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(1000);
        //1.change focus from main page to frame i.e another web page
		driver.switchTo().frame("iframeResult");//using name or id
	//	driver.switchTo().frame(0);//using frame index
		Thread.sleep(1000);
		WebElement test = driver.findElement(By.xpath("//button[@type='button']"));
	    test.click();
	    Thread.sleep(1000);
	//  driver.switchTo().parentFrame();//two methods to change focus from child to main
		driver. switchTo().defaultContent();
	    WebElement theme = driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]"));
	    theme.click();
	
	}

}
