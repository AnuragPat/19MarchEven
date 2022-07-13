package contructor;

public class CC11 {
	
   int a;
   int b;
   
	
	public CC11() {
		 a=750;
		 b=150;
		 int c=a+b;
		 System.out.println("The value of c is "+c);
	}
	
	
	public static void main(String[] args) {
		
		CC11 UU=new CC11();
		UU.total();
		
		UU.total1();
		UU.total2();
	}
      public  void total() {
    	  int sum=a+b;
	System.out.println("The value of a and b is "+sum);
}
      public void total1() {
    	  int mul=a*b;
    	  System.out.println("The multification is "+mul);
      }
      
      public void total2() {
    	  int div=a/b;
    	  System.out.println("The divion is "+div);
      }
      
}

