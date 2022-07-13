package TestNGStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledStudy {
	
	
  @Test(enabled=false)       //** default value is true
  public void x() {
	  Reporter.log("Method x is running",true);
  }
  
  @Test
  public void y() { 
	  Assert.fail();   //**for my understanding
	  Reporter.log("Method y is running",true);
  }
  
  @Test
  public void z() {
	  Reporter.log("Method z is running",true);
  }
  
  
  
  
}
