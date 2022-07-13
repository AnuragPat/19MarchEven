package Control_Statements;

public class Else_IfStudy {

	public static void main(String[] args) {
		// if u get grade A then u go in final stage
		//if u get grade B then u go semi-final stage
		//if u get grade C u go in 2nd level stage
		// if you get grade D it is goodS
     char grade='D';
     if(grade=='A') 
     {
    	System.out.println("You go in final stage ."); 
     }
     else if(grade=='B')
     {
    	 System.out.println("You go in semi final stage . ");
     }
     else if(grade=='C') 
     {
    	 System.out.println("You go to in next stage .");
     }
     else
     {
		System.out.println("Good performance");
	}
	
      int star=0;
       if(star==5) 
       {
    	   System.out.println("Excellent quality of product");
       }
       else if(star==4) {
    	   System.out.println("Better quality product");
       }
       else if(star==3) {
    	   System.out.println("Good quality product");
       }
       else if (star==2) {
    	   System.out.println("Very poor quality of product");
       }
       else {
    	   System.out.println("Do't Take product");
       }
}
}