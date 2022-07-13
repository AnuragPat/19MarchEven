package UpCasting_Study22;

public class CC extends Father{

	public static void main(String[] args) {
		
//**** Father & CC class for abstract study ****		
		
		// Concrete class of 11.father abstract class 
     CC obj=new CC();
     obj.bike();
     obj.car();
     obj.cycle();
     obj.phone();
	}

	@Override
	void care() {
		System.out.println("Father's care completed in cc");
		
	}

	@Override
	protected void cycle() {
		System.out.println("Father's cycle completed in cc");
		
	}

}
