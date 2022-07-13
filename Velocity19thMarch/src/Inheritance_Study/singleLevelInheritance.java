package Inheritance_Study;

public class singleLevelInheritance {

	public static void main(String[] args) {
		// TO call mothers non static property I need create mother object
       Mother GG=new Mother();
       // to call child non static property I need to create  child object
       Child KK=new Child();
       GG.nature();   //calling mothers property
       Mother.care();  //calling mothers property
       
       KK.mobile();
       Child.laptop();
       
       KK.nature();//calling mothers non static property by using child object
       Child.care();//calling mothers static property by using child classname
	}

}
