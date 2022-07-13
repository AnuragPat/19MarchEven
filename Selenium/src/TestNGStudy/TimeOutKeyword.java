package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutKeyword {
  @Test
  public void TC1() {
	  Reporter.log("TC1 is running",true);
  }
  
  @Test(timeOut=2000)
  public void TC2() throws InterruptedException {
	  Thread.sleep(3000);//takes more time than 2000 hence not execute
	//  Thread.sleep(200);//takes less time than 2000 hence execute
	  Reporter.log("TC2 is running",true);
  }
  
  @Test
  public void TC3() {
	  Reporter.log("TC2 is running",true);
  }
  
  
  
  
  
}
