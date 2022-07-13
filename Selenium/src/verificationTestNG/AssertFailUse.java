package verificationTestNG;

import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFailUse {
  @Test
  public void myMethod() {
	  String a="ABCD";
	  String b="ABCD";
	  String c=null;
	  
	  Assert.assertNull(c, "TC is fail value is not null");
	  Reporter.log("TC is pass value is null",true);
	  
	  Assert.assertNotEquals(a, b,"TC is failed values are equal");
	  Reporter.log("TC is fail",true);
	  
	  
	  Assert.assertEquals(a, b,"TC is failed values are different");
	  Reporter.log("TC is pass values are same",true);
	  
	  
  }
	
}
