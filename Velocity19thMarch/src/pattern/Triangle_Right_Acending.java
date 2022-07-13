package pattern;

public class Triangle_Right_Acending {

	public static void main(String[] args) {
		//       *
		//      **         
        //     ***
		//    ****
		//   *****
		
		//step1===row=5;cell=5;
		int space=4;
		int star=1;
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
			star++;
			space--;
		}
	}

}
