package polymorphism;

public class MethodOverloding {

	public static void main(String[] args) {
		/* Method overloading using different access specifier
		 
		 */
          add(100, 50);
          MethodOverloding O=new MethodOverloding();
          O.add(5, 100000, 57380);
          O.add(1,20,30,40);
          add(100);
          add(45.56f);
         O. add();
          
	}
   public static void add(int a,int b) {
	   int c=a+b;
	   System.out.println(c);
   }
   public void add(int a,int b,int c) {
	   int f=a+b+c;
	   System.out.println(f);
   }
   
   protected void add(int a,int b,int c,int d)//we can use protected access specifier with nonstatic
   {
	   System.out.println(a);
   }
   protected static void add(int a)//we can use protected access specifier with static method
   {
	   System.out.println(a);
   }
   private static void add(float a)// we can use private access specifier with non static method
   {
	   System.out.println(a);
   }
   private void add()// we can use private access specifier with non static method
   {
	   int a=10;
		int b=10;
		int f=a+b;
	   System.out.println(f);
   }
}
