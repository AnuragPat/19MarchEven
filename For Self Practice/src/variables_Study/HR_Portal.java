package variables_Study;

public class HR_Portal {

	public static void main(String[] args) {
		Employee_Details Yogesh=new Employee_Details();
		Yogesh.EmplName="Gautam";
		Yogesh.EmplId="Gautam@gmail.com";
		Yogesh.Gender='M';
		Yogesh.Salary=900000f;
		Yogesh.IdNum=123;
		
		
		
		Employee_Details JJ=new Employee_Details();
		JJ.EmplName="Gauri";
		JJ.EmplId="Gauri@gmail.com";
		JJ.Gender='F';
		JJ.Salary=65000f;
		JJ.IdNum=99;
		
		
		
		
		
		
		Yogesh.Info();
		JJ.Info();
		

	}

}
