package verificationTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualUse {
  @Test
  public void assetEqual() {
	  String a="Pune";
	  String b="Pune1";
	  Assert.assertEquals(a, b,"Actual and expected values are not equal");
	  
	  
  }
}
