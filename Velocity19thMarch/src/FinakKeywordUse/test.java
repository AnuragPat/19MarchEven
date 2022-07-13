package FinakKeywordUse;

public final class test {
	
	public static void main(String[] args) {
		
		int a=50;
		a=a+10;//------------------->we update non static value
		System.out.println(a);
		
		final int b=20;
		//b=b+10;------------------->we can't update final value
		int sum=b+10;
		System.out.println(b);
		System.out.println(sum);
		
		test T=new test();
		T.demo();
		
		

	}
   public final void demo()//-------------->declaring one final method
   {
	  System.out.println("hi I'm final method of test class ."); 
   }
  // public final void retest();--------------->wecan not override final method
	   
}
