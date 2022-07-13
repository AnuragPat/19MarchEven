package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethod {
  @Test
  public void a() {
	  Reporter.log("TC a is running",true);
  }
  
  
  @Test(dependsOnMethods = {"a"})
  public void g() {
	  Reporter.log("TC g is running",true);
  }
  
  
  @Test
  public void d() {
	  Reporter.log("TC d is Running",true);
  }
}
