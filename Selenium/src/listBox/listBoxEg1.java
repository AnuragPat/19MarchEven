package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class listBoxEg1 {

	public static void main(String[] args) throws InterruptedException   {
	System.setProperty("webdriver.chrome.driver","G:\\NewSelenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(8000);
	
	  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  Thread.sleep(12000);
	  WebElement Day = driver.findElement(By.name("birthday_day"));
	  Thread.sleep(20000);
	  Select S=new Select(Day);
	  S.selectByIndex(20);//--->using index
	//  S.selectByValue("21");//------>using value
	//  S.selectByVisibleText("21");//--->using text
	  
	  
	  WebElement Month = driver.findElement(By.name("birthday_month"));
	  Select ss=new Select(Month);
	  Thread.sleep(1000);
	  ss.selectByIndex(7);//------>using index
	//  ss.selectByValue("8");//------>using value
	//  ss.selectByVisibleText("Aug");//---->using text
	  
	  WebElement Year = driver.findElement(By.name("birthday_year"));
	  Select sss=new Select(Year);
	 // sss.selectByValue("1995");//----->using value  
	  sss.selectByIndex(27);//using index
	 // sss.selectByVisibleText("1995");//----->using text
	}

}