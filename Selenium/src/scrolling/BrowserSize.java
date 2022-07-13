package scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		System.out.println(driver.manage().window().getSize());
         Thread.sleep(500);
         
		//To set size use dimension class & create object of dimension class
		Dimension d=new Dimension(850,500);
		driver.manage().window().setSize(d);
	
	}
}