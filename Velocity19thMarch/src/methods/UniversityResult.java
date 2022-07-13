package methods;

public class UniversityResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UniversityResult Information=new UniversityResult();
		Information.StudentInfo();
		Information.StudentInfo();
		Information.studentInfo1("Savita",02,'B',200.36d);
		Information.studentInfo1("Yogesh", 22, 'A', 99.99f);
		ParameterMethodFromAnother Difference=new ParameterMethodFromAnother();
		Difference.studentInfo3("Anurag",04, 'A', 99.99d);
		ParameterMethodFromAnother.studentInfo4("Sanyusha", 20, 'C', 1000.10f);
        ParameterMethodFromAnother.additon(200, 500);
	}
       public void StudentInfo() {
    	   String studentname="Velocity";
    	   int RollNum=10;
    	   char Grade='A';
    	   float TotalMarks=250f;
    	   System.out.println("===================");
    	   System.out.println("The student name is "+studentname);
    	   System.out.println("The roll num is "+RollNum);
    	   System.out.println("The grade of student is "+Grade);
    	   System.out.println("The total marks is "+TotalMarks);
    	   System.out.println("===================");
       }   
       
       public void studentInfo1(String studentName,int RollNum,char Div,double TotalMarks) {
    	
    	  
    			System.out.println("=================");
    			System.out.println("The name of student is "+studentName);
    			System.out.println("THe roll no of is "+RollNum);
System.out.println("The div is "+Div);
System.out.println("The total marks is "+TotalMarks);
System.out.println("=================");
       }
       
       public void studentInfo2(String StudentName,int RollNum,char Div,float TotalMarks)
       {
    	   System.out.println("================");
    	   System.out.println("The student name is "+StudentName);
    	   System.out.println("The roll num is "+RollNum);
    	   System.out.println("The divion is "+Div);
    	   System.out.println("The total marks of student is "+TotalMarks);
    	   System.out.println("================");
    	   
    	   
    	   
    	   
       }
       
       
       
}
