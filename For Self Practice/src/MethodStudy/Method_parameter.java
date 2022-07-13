package MethodStudy;

public class Method_parameter {

	public static void main(String[] args) {
		info();
		Method_parameter GG=new Method_parameter();
		GG.info2("Shree", 'B', 96.57f, 22);
        parameter_Another BB=new parameter_Another();
        BB.info3("Sanyu", 90.85f);
        GG.info2("Sanu",'A', 78.10f,40);
       
	}

	
	
	
	
	public static void info() {
		String Name="Pari";
		char grade='A';
		float percentage=98.76f;
		int rollNum=10;
		System.out.println("======================");
		System.out.println("name is "+Name);
		System.out.println("roll number is "+rollNum);
		System.out.println("div is "+'A');
		System.out.println("percentage is "+percentage);
	}
	public void info2(String name,char div,float percentage,int rollNum) {
		System.out.println("===========================");
		System.out.println("Name is "+name);
		System.out.println("divion is "+div);
		System.out.println("percentage is "+percentage);
		System.out.println("RollNum is "+rollNum);
	}
}
