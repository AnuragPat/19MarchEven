package Constructor;

public class UserDefineConstructor {

	
	public UserDefineConstructor() {
		
		System.out.println("I am user defined constructor.");
		 int a=12;
		 int b=36;
		System.out.println("The addtion of a and b is "+(a+b));
	}
	
	
	
	
	public static void main(String[] args) {
		
     UserDefineConstructor tt=new UserDefineConstructor();
     tt.test();
	}

	public void test() {
		System.out.println("Hi this is test method");
	}
}
