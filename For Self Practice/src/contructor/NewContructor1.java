package contructor;

public class NewContructor1 {
     int a;
     int b;
     int c=a+b;
	
	
	
	public NewContructor1() {
		int a=20;
		int b=30;
	System.out.println("The addition of a and b is "+(a+b));
	}
	public void summation() {
		int a=10;
		int b=10;

		int c= a+b;
		System.out.println("The value of c is "+c);
	}
	
	
	public static void main(String[] args) {
		NewContructor1 DD=new NewContructor1();
		DD.summation();
		NewContructor1 BB=new NewContructor1(100, 100);
		BB.summation();
		
		BB.summation1();

	}
    public NewContructor1(int x,int y) {
    	a=x;
    	b=y;
    	
    	System.out.println("The value of x is "+a);
    	System.out.println("The value of y is "+b);
    }
    public void summation1() {
    	int a=10;
    	System.out.println("The value of a is "+a);
    }
    
    
    
}
