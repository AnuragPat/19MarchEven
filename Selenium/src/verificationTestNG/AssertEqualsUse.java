package verificationTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void TC1() {
	  String ActualResult="VCTC Pune";
	  String expectedResult="VCTC";
	  
	  Assert.assertEquals(ActualResult, expectedResult,"actual & expected not matching");
	  Reporter.log("TC1 is running",true);
  }
}
