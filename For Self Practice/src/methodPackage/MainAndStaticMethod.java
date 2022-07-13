package methodPackage;

public class MainAndStaticMethod {

	public static void Savita()
	{
		System.out.println( "Savita is my static method");
	}
	
	public static void calculation() {
		System.out.println("Calculation is static regular method");
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is my main method");
        Savita();
        calculation();//calling static method from same class
        AnotherClass.software();//calling static method from anotherClass
        AnotherClass.testing();//calling static regular method from another class
	}

}
