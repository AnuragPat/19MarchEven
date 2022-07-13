package interfaceStudy;

public class myClass implements MyInterface {

	public static void main(String[] args) {
		//calling interface method
      myClass M=new myClass();
      M.test();
      M.test1();
    //  a=1+a;we can not update final variable value
      System.out.println(a);
      M.add();
      M.demo();
      MyInterface.sum();//calling static method in interface*****
	}

	@Override
	public void test() {
		System.out.println("This test method of interface completed in implementation class ");
		
	}

	@Override
	public void test1() {
		System.out.println("This test method of interface completed in implementation Class ");
		
	}
	public void add() {
		System.out.println("Hi I'm own method of implementation class method");
	}

	@Override
	public void demo() {
		System.out.println("Demo is another namemethod in interface completed in implementation class");
		
	}

}
