package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  @Test(priority=1)
  public void a() {
	  Reporter.log("Method a is running",true);
  }
  
  @Test
  public void b() {
	  Reporter.log("Method b is running",true);
  }
  
  @Test
  public void c() {
	  Reporter.log("Method c is running",true);
  }
}
