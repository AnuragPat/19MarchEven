package testNgUsingUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityFacebook {
	
	public static String readDataFromPropertyFile(String key) throws IOException {
		Properties pp=new Properties();//created obj of properties 
		FileInputStream file= new  FileInputStream("C:\\Users\\pc world\\eclipse-workspace\\Selenium\\FacebookPropertyFile");
		pp.load(file);
		String value = pp.getProperty(key);
		return value;
	}
	
	public static void captureScreenshot(WebDriver driver,String ID) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File obj=new File("F:\\New ScreenShot\\FacebookScreenshot"+ID+".png");
		FileHandler.copy(src, obj);
	}

}
