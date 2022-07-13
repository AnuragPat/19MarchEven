package abstractStudy11;



public class ConcreteClass extends absractClass {

	public static void main(String[] args) {
		// TO crete obj
		ConcreteClass C=new ConcreteClass();
		C.add();
		C.rest();
		ConcreteClass.add2();
		C.add3();
		C.add4();
		
		
		
	}

	@Override
	public void rest() {
		System.out.println("rest is incomplete method completed in cc.");
		
	}

	@Override
	protected void add3() {System.out.println("Add3 protected method completed in cc.");
		
	}

	@Override
	void add4() {
		System.out.println("Add4 default method completed in cc.");
		
	}
}
