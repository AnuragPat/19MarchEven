package listnerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener {
	
@Override
	public void onTestSuccess(ITestResult result) {
	Reporter.log("TC is passed successfully",true);
	result.getName();                    //** method is used to get test name
	Reporter.log("The name of passed tc is "+result.getName(),true);	
	}
@Override
	public void onTestFailure(ITestResult result) {
      Reporter.log("TC is failed please check again",true);
     String name = result.getName();        //**By using variable
      Reporter.log("The name failed TC is "+name,true);
	}

@Override
		public void onTestSkipped(ITestResult result) {
			Reporter.log("TC is skipped please check dependent method",true);
			String name2 = result.getName();
			Reporter.log("The name skipped TC is "+name2,true);
			}

}
