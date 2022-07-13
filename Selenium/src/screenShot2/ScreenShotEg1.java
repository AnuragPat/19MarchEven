package screenShot2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotEg1 {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	File Source=(( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String str=RandomString.make(3);
	System.out.println(str);
	File dest=new File("G:\\ScreenShot\\newScreenshot"+str+".jpeg");
	FileHandler.copy(Source, dest);
	
	
	}

}
