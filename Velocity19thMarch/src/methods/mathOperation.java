package methods;

public class mathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       mathOperation mo=new mathOperation();
    		   mo.add();
    		   mo.sub();
    		   mo.mul();
    		   mo.div();
    		   mo.method();
	}

	public void add() {
		int a=120;
		int b=360;
		int add= a+b;
		System.out.println("The addtion is "+add);
				
	}
	public void sub() {
		int a=100;
		int b=50;
		int sub=a-b;
		System.out.println("The substraction of a & b is "+sub);
	}
	
	public void mul() {
		int a=20;
		int b=100;
		int mul=a*b;
		System.out.println("The multification of a & b is "+mul);
	}
	
	public void div() {
	int a=120;
	int b=20;
	int c=a/b;
	System.out.println("The divion of a & b is "+c);
	}
	
	
	public void method(){
	      long a=120l;
	      long b=360l;
	      long c=b/a;
	      System.out.println("The short is "+ c);
	
	}
	}
	
	
	
	
	
	
	
	

