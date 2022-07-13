package verificationTestNG;

import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEquals {
  
	@Test
     public void myTest() {
	  String ActualCity="Kolhapur";
	  String ExpectedCity="Pune";
	  String c="Kolhapur";
	  
//	  Assert.assertNotEquals(ActualCity, ExpectedCity,"Actual & expected city not matching");
	  Assert.assertNotEquals(ActualCity, c,"Actual and expected result are matching TC fail");//for checking purpose
	  Reporter.log("myTest is running",true);
  }
}
