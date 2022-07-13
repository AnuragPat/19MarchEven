package MethodStudy;

public class methodParameter {//int d=90;
	                             // int e=50;
	                             //int add=d+e;
	                               //static int c=100
	//MAKING FOR PRACTICE
	          String StudentName;
	          char Grade;float Percentage;
	
	
	 public methodParameter(String name,char Grade2,float perc) {
		 StudentName=name;
		 Grade=Grade2;
		 Percentage=perc;
	 }
   

	public static void main(String[] args) {
		methodParameter Q=new methodParameter("Sanu", 'A', 86.67f);
		Q.test();
		methodParameter J=new methodParameter("Seema", 'B', 79.8f);
		J.test();
		
      
	}
      public void test() { System.out.println("Name Of 1st student is "+StudentName);
      System.out.println("char is "+Grade);
      System.out.println("Percentage is "+Percentage);
      System.out.println("=============================================");
      
    
      }
	
}
