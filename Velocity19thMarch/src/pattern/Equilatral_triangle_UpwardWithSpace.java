package pattern;

public class Equilatral_triangle_UpwardWithSpace {

	public static void main(String[] args) {
		//      *
		//    * * *
		//  * * * * *
		//* * * * * * *
		//Step1==row=4cell=7;
		int star=1;
		int space=3;
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;//=star+2;
			space--;//=space-2;

			
		}
		
	}

}
