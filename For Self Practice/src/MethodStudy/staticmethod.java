package MethodStudy;

public class staticmethod {
	int d=90;
	int e=50;
	int add=d+e;
	static int c=100;
	
//for gr disscussion
	
	public static void main(String[] args) {
		display();
		staticmethod Obj=new staticmethod();
		Obj.division();
		System.out.println("The value of d is "+Obj.d);
		System.out.println("The addition of d & e is "+Obj.add);
		System.out.println("Value of c is "+c);
		
		
		anotherClass KK=new anotherClass();
		System.out.println("value of non static variable is "+KK.u);
		System.out.println("The value of static variable is "+anotherClass.y);
		
		
		
	}
     public static void display()
    {  
    float a=50f;
    float b=40f;
    float add= a+b;
    System.out.println("addition is "+add);
    

}
     public void division() {
    	 long a=600;
    	 short b=400;
    	long c=b/a;
    	 System.out.println("the div is "+c);
     }
}
