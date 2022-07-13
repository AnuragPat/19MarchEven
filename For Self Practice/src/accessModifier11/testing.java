package accessModifier11;

public class testing {

	public static void main(String[] args) {
		//for study
		demo1();
		demo2();
		demo3();
		demo4();

	}
   private static void demo1() {
	   System.out.println("this is private method");
   }
   static void demo2() {
	   System.out.println("this is default method");
   }
   protected static void demo3() {
	   System.out.println("this protected static method");
   }
   public static void demo4() {
	   System.out.println("this is public static method");
   }
}
