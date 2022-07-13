package array;

public class ArrayStudy {

	public static void main(String[] args) {
		// array declaration
		String name[]=new String[4];
		name[0]="Ram";
		name[1]="Seeta";
		name[2]="Laxman";
		name[3]="Bharat";
	//	name[5]="Ravan";------>out off boundry
		
		//name
       System.out.println(name[0]); 
       System.out.println(name[1]);
       System.out.println(name[2]); 
       System.out.println(name[3]);
    //   System.out.println(name[5]);
       
       System.out.println("==================================");
       
       for(int i=0;i<=3;i++) {
    	   System.out.println(name[i]);
       }
       System.out.println("==================================");
       for(int i=3;i>=0;i--) {
    	   System.out.println(name[i]);
       }
       
       System.out.println("==================================");
       for(int i=0;i<=name.length-1;i++) {
    	   System.out.println(name[i]);
       }
       
	}

}
