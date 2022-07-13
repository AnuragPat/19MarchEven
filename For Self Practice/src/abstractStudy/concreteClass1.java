package abstractStudy;

public class concreteClass1 extends AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concreteClass1 CD=new concreteClass1();
		CD.add();
		CD.add2();
		concreteClass1.add1();//using child class name
		AbstractClass.add1();//using parent class name

		
	}

	@Override
	public void add() {
             System.out.println("add is completed in concrete class");
		}
		
	}
	
	
	
		
		
		
		

	
	
	
	


