package UpCasting_Study22;

public class Daughter extends mother {

	public static void main(String[] args) {
		
		//******Daughter & mother class for up casting******
		
    mother MM=new Daughter();//object creates on the reference of mother
    MM.saree();
    MM.mobile();
    
   
    
   
	}
	protected void saree() {
		System.out.println("blue colour");
	}
	void mobile() {
		System.out.println("Oppo");
	}

}
