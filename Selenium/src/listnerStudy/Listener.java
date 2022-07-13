package listnerStudy;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import baseForFailedScreenshotTC.BaseClass;


import testNgUtilityNew.UtilityPropTCFail;

public class Listener extends BaseClass implements ITestListener {
	
	// It is for screenShot for fail TC
	
	 @Override
	public void onTestFailure(ITestResult result) {
		
		 try {
			 UtilityPropTCFail.captureScreenShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 
	 
	 @Override
	public void onTestSuccess(ITestResult result) {
	
		Reporter.log("TC is passed & Name of TC is "+result.getName(),true);
	}
	
	

}
