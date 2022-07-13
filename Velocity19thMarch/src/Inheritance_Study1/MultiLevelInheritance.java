package Inheritance_Study1;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TO call non-satic properties of supermost class create obj
		GrandMother MM=new GrandMother();
		MM.reciepe();//calling own property
		GrandMother.stories();
		
		Mother BB=new Mother();
		BB.nature();//calling own property
		BB.reciepe();//calling super class property using subclass object
		Mother.care();
		Mother.stories();
		
        Child CC=new Child();
        CC.mobile();//calling own property
        CC.reciepe();//calling supermost class property using child object
        CC.nature();//calling super class property using child object
        
        Child.stories();//calling satic supermost class property usingchild class name
        Child.care();//calling super class property using child class name
        Child.laptop();//calling own static property
        
	}

}
