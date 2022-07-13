package Constructor;

public class CC2 {
      int a;
      int b;
     
      
      public CC2() {
    	  a=100;
    	  b=900;
      }
      
      
      public CC2(int x) {
    	  a=x;
      }
      
      
      public CC2( int x,int y) {
    	  b=y;
    	  a=x;
      }
      
	public static void main(String[] args) {
		CC2 kk=new CC2();
		kk.add();
		CC2 nn=new CC2(90);
		nn.add();
		CC2 mm=new CC2(10,20);
		mm.add();
		CC2 mn=new CC2(100, 250);
		mn.add();
	
	}
    public void add() {
    	int sum=a+b;
    	System.out.println("sum is "+sum);
    }
    
    
}
