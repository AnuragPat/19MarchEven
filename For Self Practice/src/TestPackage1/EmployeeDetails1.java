package TestPackage1;

public class EmployeeDetails1 {

	
	public static void display(String EmployeeName,String EmailId,float Salary,char Remark) {
		System.out.println("=====================================");
		System.out.println("The name of employee is "+EmployeeName);
		System.out.println("The email-Id is "+EmailId);
		System.out.println("The salary of employee is "+Salary);
		System.out.println("The remark of employee is "+Remark);
		System.out.println("======================================");
	}
	
	
	
	
	
	public static void main(String[] args) {
	display("Yogesh", "yograj@221", 50000.00f, 'A');
    display("Anurag", "shravya2704@gmail", 30000f, 'C');
    EmployeeDetails1 BB=new EmployeeDetails1();
    BB.test("Shree", "seema123@gmail.com", 200000f, 'A');
    BB.test("Pari", "savita@gmail.com", 250000f, 'A');
	}
	
	
    public void test(String EmployeeName,String EmailId,float Salary,char Remark) {
    	System.out.println("=====================================");
		System.out.println("The name of employee is "+EmployeeName);
		System.out.println("The email-Id is "+EmailId);
		System.out.println("The salary of employee is "+Salary);
		System.out.println("The remark of employee is "+Remark);
		System.out.println("======================================");
	
    }
}
