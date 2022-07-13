package control_statements;

public class Else_IfStudy {

	public static void main(String[] args) {
		// if your marks>=66------->you are distn
		//elseif marks<66 & marks>=60------->you are in 1st class
		//elseif marks<60 & marks>=50------->you are 2nd class
		//elseif marks<50 & marks>=35------->you are pass
		//else
		int marks =38;
		if(marks>=66) {
			System.out.println("You are in DISTINCTION .");
			
		}
		else if(marks<66 & marks>=60)
		{
			System.out.println("You are in 1st class .");
		}
		else if (marks<60 & marks>=50)
		{
			System.out.println("You are in 2nd class .");
		}
		else if(marks<50 & marks>=35)
		{
		System.out.println("You are JUST PASS .");	
		}
		else 
		{
			System.out.println("You are failed ");
		}
		float percentage=88.66f;// for my study
		if( percentage>=66.66f) {
			System.out.println("u got dinstiction");
		}
		else if(percentage>=55.55f & percentage<66.66f){
			System.out.println("u got 1st class");
		}
		else {
			
		}
	}

}
