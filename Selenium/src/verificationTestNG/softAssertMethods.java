package verificationTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertMethods {
  @Test
  public void missionMethod() {
	  String City="INDIA";
	  String City1="USA";
	  String City2="INDIA";
	  String c =null;
	  String d="abc";
	  boolean x=true;
	  boolean y=false;
	  
	  
	  SoftAssert place=new SoftAssert();
	  
//	  place.assertEquals(City1, City2,"TC is failed values are different");
	  place.assertEquals(City, City2,"TC is failed values are not matching");
	  
	  
	  place.assertNull(c,"TC is fail value is not null");
//	  place.assertNull(d,"TC is failed value is not null");
	  
	 
	 place.assertTrue(x,"TC is failed value is not true");
//	 place.assertTrue(y, "TC is failed value is true");
	 
	 
//	 place.assertFalse(x,"TC is failed value is not true");
	 place.assertFalse(y, "TC is failed value is true");
	 
	 
	 place. assertAll();
  }
}
