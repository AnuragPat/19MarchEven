package methods;

public class nonstatic {

	
	public void display()
	{
		System.out.println("Hi this is non static display method.");
		
	}
	public void running() {
	System.out.println("The running is non static method.");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nonstatic u=new nonstatic();
		u.display();//calling non static method from same class
		
	
		u.running();//calling non static regular method from same class
		
		nonstatic n=new nonstatic();
		n.nothing();//calling non static regular method from same class
		
		nonstatic2 oo=new nonstatic2();
		oo.another();
		
		nonstatic2 patil=new nonstatic2();	
	    patil.testing();
	}

	public void nothing()
	{	
	System.out.println("The nothing is non static method from same class");}
}
