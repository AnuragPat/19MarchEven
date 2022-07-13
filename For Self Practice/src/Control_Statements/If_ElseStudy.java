package Control_Statements;

public class If_ElseStudy {

	public static void main(String[] args) {
		// lamp glow when value is 1
		int value=1;
		if(value==1)
		{
			System.out.println("Lamp glow");
		}
		else 
		{
			
		}
		
		//if marks more & equal to 90 then you got prize
		int marks=90;
		if(marks>=90)
		{
		System.out.println("You got prize");	
		}
		else 
		{
			System.out.println("You do't get prize .");
		}
		//if marks more than 75 & less than 90 
		int a=85;
		if(a>=75 & a<=90)
		{		
			System.out.println("u got Distinction .");
		}
		else
		{
		System.out.println("You are pass");	
		}
		//if marks between 35 to 50
		int marks1=54;
		if(marks1>35 & marks1<50) 
		{
			System.out.println("You are just PASS");
		}
		else 
		{
			System.out.println("FAIL");
		}
	}
	

}
