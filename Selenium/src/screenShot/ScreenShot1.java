package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.get("https://en-gb.facebook.com/login/");
		Thread.sleep(1000);
        File source = (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        File dest=new File("G:\\ScreenShot\\MyScreenshot.png");
        FileHandler.copy(source, dest);
	}

}
