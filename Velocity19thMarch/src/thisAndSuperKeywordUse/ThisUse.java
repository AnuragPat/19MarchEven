package thisAndSuperKeywordUse;

public class ThisUse {
	int a=100;
	int b=500;
	static int c=1000;// static global variable

	public static void main(String[] args) {
		// calling non static method
		ThisUse A=new ThisUse();
		A.addition();
		
	

	}
     public void addition() {
    	 int a=10;
    	 int b=50;
    	 System.out.println("Value of a is "+a);
    	 System.out.println("Value of global non static variable a is "+this.a);
    	 System.out.println("Value of local nonstatic variable b is "+b);
    	 System.out.println("Value of global nonstatic variable b is "+this.b); 
    	 System.out.println("The value of static variable is "+this.c);// calling static global variable
    	 
    	 int add=this.a+a;
    	 int sub=this.b-b;
    	 System.out.println("Value of add is "+add);
    	 System.out.println("value of sub is "+sub);
     }
}
