package Abstract_Study;

public class Abstract_test {

	public static void main(String[] args) {
		// we can not create obj of abstract class 
		//we create obj of concrete class
		Concrete_use U=new Concrete_use();
		U.test();//----------------------->method completed in concrete class
		U.test1();//calling method of Abstract class
		U.test2();//calling method of Abstract class
		U.test3();//own method of concrete class
		
   }
}
