package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeywordInvocationCount {
  @Test(invocationCount=2)
  public void a() {
	  Reporter.log("a method is running",true);
  }
  @BeforeMethod
  public void b() {
	  Reporter.log("Before method is running",true);
  }
  @AfterMethod              //** for my understanding
  public void c() {
	  Reporter.log("After method is running",true);
  }
}
