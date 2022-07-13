package Variable_study;

public class HR_portal {

	public static void main(String[] args) {
		Employee Rahul=new Employee();
		Rahul.empid=2;
		Rahul.sal=200000;
		Rahul.RM="Sachin T";
		
		
		Employee Sara=new Employee();
		Sara.empid=3;
		Sara.sal=60000;
		Sara.RM="Sachin T";
		
		Employee Arjun=new Employee();
		Arjun.empid=6;
		Arjun.sal=900000;
		Arjun.RM="Sachin T";
		
		
		
		Rahul.EmpInfo();
		Sara.EmpInfo();
		Arjun.EmpInfo();
		

	}

}
