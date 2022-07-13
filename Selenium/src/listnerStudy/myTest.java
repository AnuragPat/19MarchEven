package listnerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listnerStudy.Listner.class)    //**use listeners annotation here

public class myTest {
  @Test
  public void myMethod1() {
	  Reporter.log("My method is running ",true);
  }
  @Test
  public void myMethod2() {
	  Assert.fail();
	  Reporter.log("My method2 is running ",true);
  }
  
  @Test(dependsOnMethods = {"myMethod2"})
  public void myMethod3() {
	  Reporter.log("My method3 is running ",true);
  }
}
