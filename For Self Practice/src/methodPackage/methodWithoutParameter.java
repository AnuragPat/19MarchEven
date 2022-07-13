package methodPackage;

public class methodWithoutParameter {

	public static void main(String[] args) {
		display();
		
		methodWithoutParameter ZZ=new methodWithoutParameter();
		ZZ.withParameter("Sanyu",22,'B');
		ZZ.parameter();
		ZZ.result("Ammmmmm", 82, 'B');
		ZZ.result("Serv", 36, 'F');
		ZZ.withParameter("Avyu", 59, 'G');
		result1("Anu", 10);
		result1("Manu",99 );
	}

	
	public static void display() {
		String studentName="Yogesh";
		int RollNum=22;
		char Grade='A';
		float TotalMarks=100.10f;
		System.out.println("=======================================");
		System.out.println("The name of student is "+studentName);
		System.out.println("The roll no is "+RollNum);
		System.out.println("The grade is "+Grade);
		System.out.println("The marks is "+TotalMarks);
		System.out.println("=======================================");
	}
	public  void withParameter(String Name,int RollNum,char Grade) {
		
		System.out.println("-----------------------");
		System.out.println("The name is "+Name);
		System.out.println("The roll no is "+RollNum);
		System.out.println("The Grade is "+Grade);
		System.out.println("------------------------");
	}
	public void parameter() {
		String studentname="Anurag";
		int RollNum=22;
		char grade='A';
		float Totalmarks=99.99f;
		System.out.println("==================================");
		System.out.println("the name of student is "+studentname);
		System.out.println("The roll no is "+RollNum);
		System.out.println("Grade is"+grade);
		System.out.println("The marks is "+Totalmarks);
		System.out.println("==================================");
	}
	public void result(String studentName, int RollNum,char Grade) {
		System.out.println("==========================");
		System.out.println("The name of student is "+studentName);
		System.out.println("The roll num is "+RollNum);
		System.out.println("The grade is "+Grade);
		System.out.println("==========================");
		}
		
	public static void result1(String Name,int RollNum) {
		System.out.println("the name is "+Name);
		System.out.println("The roll no is "+RollNum);
		
	}
	
}
