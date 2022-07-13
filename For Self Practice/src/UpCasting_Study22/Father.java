package UpCasting_Study22;

public abstract class Father {
	
	//11. use of access specifiers in abstract class
	
	
    public void car(){
    	System.out.println("Swift");
    }
    void phone() {
    	System.out.println("apple");
    }
    protected void bike() {
    	System.out.println("Unicorn");
    } 
    abstract void care();
    protected abstract void cycle();
    	
}
