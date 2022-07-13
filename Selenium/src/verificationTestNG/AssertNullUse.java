package verificationTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse {
  @Test
  public void testing() {
	  String a=null;
	  String b="xyz";
	  
	  //if text null then TC pass 
//	  Assert.assertNull(b, "TC is fail value is not null");
//	  Reporter.log("TC is fail value is not null",true);
	  
//	  Assert.assertNull(a, "TC is fail value is not null ");
//	  Reporter.log("TC is passed value is null",true);
	  
	  
	 //**assertNotNull 
	  
	  Assert.assertNotNull(b, "TC is failed value is null ");
	  Reporter.log("TC is pass value is not null",true);
	  
	  
//	  Assert.assertNotNull(a, "TC is failed value is not null");
//	  Reporter.log("TC is filed value is null",true);
	  
	  Assert.fail();
  }
}
