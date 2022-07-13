package pattern;

public class Triangle_left_Decending {

	public static void main(String[] args) {
		//*****
		//****
		//***
		//**
		//*
		//step1=row=5;cell=5
		int star=5;//write no of star in 1st line
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		

	}

}
