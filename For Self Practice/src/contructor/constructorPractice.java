package contructor;

public class constructorPractice {
	 String name;
	 int a;
	public constructorPractice() {
		
	   name="sanyu";
		 a=200;
	}
	
	public static void main(String[] args) {
		constructorPractice BB =new constructorPractice();
		BB.display();
        BB.display2();
        BB.display3();
	}
public void display() {
	System.out.println("My name is "+name);
	System.out.println("the value of a is "+a);
}
   public void display2() {
	   System.out.println("Hiiiiiiii...");
   }
   public void display3() {
	   System.out.println("This non parameter constructor");
   }
}
