package UpCasting_Study;

public class duaghter extends mother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mother M=new duaghter();//this is for up casting
		M.nature();
		duaghter d=new duaghter();//--------->using obj of duaghter calling mother & duaghter property
		// same as the inheritance
		d.clever();
		d.care();
    
	}
	public void nature() 
	{
		System.out.println("Daughter's nature ");
	}
    public void clever() {
    	System.out.println("D.CLEVER");
    }
}
