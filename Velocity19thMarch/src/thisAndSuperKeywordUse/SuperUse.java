package thisAndSuperKeywordUse;

public class SuperUse extends ThisUse {
        int a=500;//non static global variable (from subclass)
        
        
	public static void main(String[] args) {
		
        SuperUse S=new SuperUse();
        S.sub();
        
	}
      public void sub() {
    	  int b=700;
    	  int sub1=b-70;
    	  System.out.println("value of sub1 is "+sub1);
    	  
    	  int sub2=this.a-50;//using non static global variable from same class
    	  System.out.println("value of sub2 is "+sub2);
    	  
    	  int add=super.a+10;//using non static global variable from superclass
    	  System.out.println("value add is "+add);
    	  
    	  int c=super.b;//calling non static global variable from superclass
    	  System.out.println("value of c is "+c);
    	  System.out.println("value of a is "+a); //calling non static global variable
      }
}
