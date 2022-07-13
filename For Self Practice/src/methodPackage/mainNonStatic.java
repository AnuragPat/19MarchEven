package methodPackage;

public class mainNonStatic {

	public void testing(){
		System.out.println("The testing is non static method.");
		}
	public void sample() {
		System.out.println("The non static method from same class is. ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  nonStaticMethod ff=new nonStaticMethod();
		  ff.testing();
		  

		ff.software();
		
		mainNonStatic gg=new mainNonStatic();
	gg.display();
		
		gg.testing();
		
		gg.sample();
	}

	public void display() {
	System.out.println("The display is non static method of same class.");
	}

}
	
