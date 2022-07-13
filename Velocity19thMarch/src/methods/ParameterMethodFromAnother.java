package methods;

public class ParameterMethodFromAnother {

	public void studentInfo3(String StudentName,int RollNum,char Div,double TotalMarks) {
		System.out.println("================");
		System.out.println("The name of student is "+StudentName); 
		System.out.println("The roll no is "+RollNum);
		System.out.println("The div is "+Div);
		System.out.println("The total marks is "+TotalMarks);
		System.out.println("================");
		
	}
	
	public static void studentInfo4(String studentName,int RollNum,char Div,double TotalMarks) {
		System.out.println("===================================");
		System.out.println("The name of student is "+studentName);
		System.out.println("The roll no is "+RollNum);
		System.out.println("The divion is "+Div);
		System.out.println("The total marks is "+TotalMarks);
		System.out.println("====================================");
	}
	public static void additon(int a,int b) {
		System.out.println("the addtion of a and b is "+(a+b));
	}
	
}
