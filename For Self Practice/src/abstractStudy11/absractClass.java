package abstractStudy11;

public abstract class absractClass {//for study purpose
     public void add() {
    	 System.out.println("add is non static complete method");
     }
     public static void add2() {
    	 System.out.println("Add2 is static complete method");
     }
     public abstract void rest();
   //  public abstract static void retest();---->we can't create static as abstract
     
     
     
	protected abstract void add3();//-----> protected abstract method in abstract class
	
	
	
	abstract void add4();//------>default abstract method in abstract class
		
	
}