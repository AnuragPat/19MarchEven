package AccessModifier;

public class use_specifier {

	public static void main(String[] args) {
		use_specifier AA=new use_specifier();
		AA.test1();//calling within class
        AA.test2();//calling within package
        AA.test3();//to call another package need of inheritance
        AA.test4();// call within project
	}
  private void test1() {
	  System.out.println("this is private test1 ");
  }
  void test2() {
	  System.out.println("this is default test2");
  }
  protected void test3() {
	  System.out.println("this is protecter test3");
  }
  public void test4() {
	  System.out.println("this is public test4");
  }
}
