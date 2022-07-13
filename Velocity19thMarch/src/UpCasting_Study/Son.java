package UpCasting_Study;

public class Son extends Father{
	//override fathers method providing diff def.in sub class
	public void car ()
	{
		System.out.println("Son's Honda civic "); 
	}
	public void bike() {
		System.out.println("Son's jawa");
	}
	public void degree() {
		System.out.println("Son's Degree");
	}

}
