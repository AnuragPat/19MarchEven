package scrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Point d = driver.manage().window().getPosition();
        System.out.println(d);
        Thread.sleep(400);
        
        //To set position ---> create obj of point class
        Point p=new Point(50, 50);
        driver.manage().window().setPosition(p);
        
	}

}
