package abstractStudy;

public abstract class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public abstract void add();//we can not take static abstract method
	public static void  add1() {
		System.out.println("add 1 is complete method of abstract class");
	}
  public void add2() {
	  System.out.println("add 2 is complete method of abstract class");
  }
}
