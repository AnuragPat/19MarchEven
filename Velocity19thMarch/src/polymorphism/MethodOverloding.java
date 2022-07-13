package polymorphism;

import polymorphism1.methodOverloading;

public class MethodOverloding {

	public static void main(String[] args) {
		//Declaring multiple methods with same method name but with 
		//different argument in a same class is called 	method overloading.

     MethodOverloding MO=new MethodOverloding();//own class method
     MO.add();
     MO.add(10,100);
     MO.add(10,100,1000);
     
     methodOverloading  oo=new methodOverloading ();//methodOverloading class method calling here
     oo.test();
     oo.test1(50, 150);
	}
  public void add() {
	  int a=10;
	  int b=90;
	  int sum=a+b;
	  System.out.println(sum);
  }
  public void add(int a,int b) {
	  int sum=a+b;
	  System.out.println(sum);
  }
  public void add(int a,int b,int c) {
	  int sum=a+b+c;
	  System.out.println(sum);
  }
}
