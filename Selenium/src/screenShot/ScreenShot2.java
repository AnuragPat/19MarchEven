package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {
//another screenshot eg for practice
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","G:\\NewSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
        Thread.sleep(500);
        File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File test=new File("F:\\New ScreenShot\\YogScreenshot.jpg");
        FileHandler.copy(source, test);
        //"https://vctcpune.com/
	}

}
