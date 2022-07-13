package pattern;

public class Tringle_Right_Decending {

	public static void main(String[] args) {
		// *****
		//  ****
		//   ***
		//    **
		//     *
	//	Step1===row=5;cell=5
		int space=0;//on 1st line no space
		int star=5;//1st line star
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
		    for(int j=1;j<=star;j++) 
		    {
			System.out.print("*");
		    }
		System.out.println();
		space++;
        star--;
        
		}
	}

}
