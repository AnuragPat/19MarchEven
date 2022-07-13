package verificationTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void myMethod() {
	  String a="abc";
	  String b=null;
	  
	  SoftAssert jj=new SoftAssert(); //create object of soft assert
	  
	  jj.assertEquals(a,b,"TC is failed values are not matching");
//	  Reporter.log("TC is passed values are matching",true);
 
  
	  jj.assertNull(b, "TC is fail value is not null ");
//	  Reporter.log("TC is passed value is null",true);
	  
	  
	  jj.assertAll();//If we don’t write assertAll then it will not notify 
  }  
  
  @Test
  public void myMethod1() {
	  String a="abc";
	  String b="abc";
	  
	  SoftAssert kk=new SoftAssert(); //create object of soft assert
	  
	  kk.assertEquals(a,b,"TC is failed values are not matching");
	  
	  
	  kk.assertAll();
}
}
