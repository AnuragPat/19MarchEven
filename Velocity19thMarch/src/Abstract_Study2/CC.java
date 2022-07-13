package Abstract_Study2;

public class CC extends abstract1 {

	public static void main(String[] args) {
		// we can create obj of concrete class
		CC C=new CC();
		C.demo();
		C.demo1();
		C.demo2();
		C.demo3();

	}
	public void demo() {
		System.out.println("demo mehod is completed in concrete class");
	}
	public void demo3() {
		System.out.println("demo3 is own method of concrete class");
	}

}
