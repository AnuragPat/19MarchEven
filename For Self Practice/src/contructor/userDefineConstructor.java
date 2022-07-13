package contructor;

public class userDefineConstructor {
	
	
	
	  public userDefineConstructor() {
	    	int a=900;
	    	int b=500;
            int c=(a+b);
		    System.out.println("the addition of a and b is "+c);
	    }
		
	    
	    public static void main(String[] args) {
	    	 userDefineConstructor gg=new userDefineConstructor();
	    	 gg.addition();
             gg.test();
		}
	    public void addition() {
	    	int a=20;
	    	int b=30;
	    	System.out.println("The addition is "+(a+b));
	    	
	    }
	public void test() {
		System.out.println("This user defined zero parameter constructor");
	}
}
