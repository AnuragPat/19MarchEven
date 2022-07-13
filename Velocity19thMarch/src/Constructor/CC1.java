package Constructor;

public class CC1{
	
	int a;
	int b;
	
	public CC1() {
		a=120;
		b=360;	
		System.out.println("hii");
		
	}
	
	
	public static void main(String[] args) {
		CC1 jj=new CC1();
		jj.addition();
        jj.substraction();
        jj.division();
	}
    
	public void addition() {
	int sum=(a+b);
	System.out.println("The addion of a and b is "+sum );
}
	public void substraction() {
		int sub=(b-a);
		System.out.println("The subtraction of a and b is "+sub);
	}
	
	public void division() {
		int div =b/a;
		System.out.println("The divion of b and a is "+div);
	}
}


