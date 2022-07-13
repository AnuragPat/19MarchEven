package testNgUtilityNew;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityPropTCFail {
	public static void captureScreenShot(WebDriver driver,String TCID) throws IOException {
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("G:\\ScreenShot\\MyScreenShotUtility"+TCID+".png");//MyScreenShotUtility-->name of pic
		 FileHandler.copy(src,dest);
}
	
	
	
}