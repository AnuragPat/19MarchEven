package iframe;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(100);
		driver.switchTo().frame("frame1");
		Thread.sleep(100);
		driver.findElement(By.tagName("input")).sendKeys("Selenium");
		Thread.sleep(1000);
	
	   driver.switchTo().defaultContent();//if we not take this step then error come
	   Thread.sleep(100);
	   driver.switchTo().frame("frame2");//switch to frame using id
	   
	  
	   
	   Thread.sleep(1000);
	   WebElement animal = driver.findElement(By.id("animals"));
	   Select s=new Select(animal);
	   s.selectByValue("big baby cat");//3 methods used for select class frame3
	   Thread.sleep(100);
	   s.selectByIndex(1);
	   Thread.sleep(100);
	   s.selectByVisibleText("Avatar");
	   Thread.sleep(5000);
	   
	  driver.switchTo().parentFrame();
	 //  Thread.sleep(5000);
	   driver.switchTo().frame("frame3");
	   Thread.sleep(5000);
	   WebElement frame3 = driver.findElement(By.id("a"));
	   frame3.click();
	 
      //driver.findElement(By.xpath("//input[type='checkbox']")).click();
	}

}
