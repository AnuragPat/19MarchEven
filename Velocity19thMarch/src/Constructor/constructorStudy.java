package Constructor;

public class constructorStudy {
	String Name;
     int RollNum;
     char Grade;
     
	public constructorStudy(String Name1,int RollNum2,char Grade3) {
		 Name= Name1;
		 RollNum=RollNum2;
		 Grade=Grade3;
		
	}
	
	
	public static void main(String[] args) {
		constructorStudy DD=new constructorStudy("Saurabh", 20, 'A');
		DD.test();
		
        constructorStudy DD2=new constructorStudy("Pari", 10, 'C');
        DD2. test();
        
        constructorStudy DD3=new constructorStudy("Hari", 55, 'C');
        DD3.test();
      
        DD2.test1();
        DD2.test12();
	}
   public void test() {
	   System.out.println("=========================");
	   System.out.println("My name is "+Name);
	   System.out.println("The roll no is "+RollNum);
	   System.out.println("Grade is "+Grade);
	   System.out.println("=========================");
   }
   public void test1() {
	   System.out.println("This is user define constructor");
   }
   public void test12() {
	   System.out.println("This is user define constructor");
   }
}
