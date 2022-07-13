package polymorphism1;

public class methodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          sub();
          sub1(50.50f, 10.10f);
          sub2(100, 100, 50);
          
          methodOverloading ob=new methodOverloading ();
          ob.test();
          ob.test1(90, 100);
	}
   public static void sub() {
	   float a=10.50f;
	   int b=6;
	   float c=a-b;
	   System.out.println(c);
   }
   public static void sub1(float a,float b) {
	   float c=a-b;
	   System.out.println(c);
   }
   public static void sub2(int a,int b,int c) {
	   int d=a+(b-c);
	   System.out.println(d);
   }
   public void test() {
	   float c=40.70f;
	   float d=68.60f;
	   float f=d-c;
	   System.out.println(f);
   }
   public void test1(int a,int b) 
   { System.out.println(a+b);
	   
   }
}
