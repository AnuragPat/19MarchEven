package pattern;

public class Triangle_left_Acending {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		//step1== count row =5; cell=5;
		
		int star =1;    //write no of star in ist line
		for(int i=1;i<=5;i++)       //outer loop for row
		{    for(int j=1;j<=star;j++)     //inner loop for cell
		    {
			System.out.print("*");
		    }
		   System.out.println();  //after printing star go on next line
		   star++;//increment in stars
		}

	}

}
