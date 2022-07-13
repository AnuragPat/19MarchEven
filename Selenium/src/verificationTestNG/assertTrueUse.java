package verificationTestNG;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertTrueUse {
 
	
	@Test
  public void myMethod() {
		boolean a=true;
		boolean b=false;
		
		
		  Assert.assertTrue(b, "Value is false TC is fail");
		  Reporter.log("TC is Pass value is true",true);
		 
		
		
//		  Assert.assertTrue(a, "TC is fail Value is False");
//		  Reporter.log("TC is Pass value is true",true);
		  
		  Assert.assertFalse(b,"TC is Failed value is true");
		  Reporter.log("TC is passed value is true",true);
	
		  
  }
}
