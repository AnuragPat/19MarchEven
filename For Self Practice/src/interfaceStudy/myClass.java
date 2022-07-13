package interfaceStudy;

public class myClass implements interfaceStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    myClass MY=new myClass();
    MY.demo();
    MY.demo1();
    myClass.add();
	}

	@Override
	public void demo() {
		System.out.println("Demo method of interface completed in implementation class");
		
	}

	@Override
	public void demo1() {
		System.out.println("Demo1 method of inerface completed in implementation class");
		
	}
	public static void add() {
		System.out.println("add method completed in implementation class");
	}

}
