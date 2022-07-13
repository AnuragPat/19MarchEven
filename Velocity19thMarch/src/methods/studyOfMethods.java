package methods;

public class studyOfMethods {
          public static void myMethod()
          {
        	  System.out.println("Hi this is my method");
        	
          }

	
	
	   public static void main(String[] args) {
		// TODO Auto-generated method stub
         myMethod(); //calling static regular method from same class
		  method1(); //calling static regular method from same class
		 testing.display();// calling static regular method from another class
		 testing.calculation();//calling static regular method from another class
	}
       public static void method1()
       { 
    	   System.out.println("This is method1");
       }
}
