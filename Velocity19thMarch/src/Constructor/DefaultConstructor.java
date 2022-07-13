package Constructor;

public class DefaultConstructor {

	
	
	
	
	public static void main(String[] args) {
		
     DefaultConstructor y=new DefaultConstructor();
     y.myMethod();
     
     y.test();
     
	}

	public void myMethod() {
		System.out.println("This is default constructor example.");
	}
	public void test() {
		System.out.println("The test is default constructor method.");
	}
	
}
