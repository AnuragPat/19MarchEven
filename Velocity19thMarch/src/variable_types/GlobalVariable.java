package variable_types;

public class GlobalVariable {
     int a=10;//global non static variable
     static int b=90;//global static variable
     
	public static void main(String[] args) {
	        GlobalVariable gv=new GlobalVariable();
	        gv.test();//calling non static variable from same class
	        test1(); // for my understanding
	        System.out.println("value of a is "+gv.a);
            System.out.println("value of b is "+b);
    Sample s=new Sample();//created object of sample class
    System.out.println("The value of non static variable from another class is "+s.p);//calling non-static variable from another class
    System.out.println("The value of static vaeriable is "+ Sample.q);//calling static variable from another class
           int sub=800-gv.a;
           int sub1=900-b;
           int sub2=1000-s.p;
           int sub3=3000-Sample.q;
           
           
           System.out.println("value of sub is "+sub);
           System.out.println("value of sub1 is "+sub1);
           System.out.println("value of sub2 is "+sub2);
           System.out.println("value of sub3 is "+sub3);
}
     
	public void test() {
		int a=890;//local variable
		int sum=a+10;//we can call non static global variable
		//int subs=b-10;//we can call static global variable//for me make it comment
		System.out.println("the value of sum is "+sum);    //taking only for my understanding 
		System.out.println("hi"+b);//calling non static global variable
	}
	public static void test1() //static method
	{
	//int sum=a+10;// we can not call non-static global variable 
	 int subt=b-10;//we call static global variable
	 System.out.println("value of sub is "+subt);//for my understanding
	 System.out.println("value of A is "+b);//calling global static varible
	}
}
