package AccessModifier;

public class SpecifierStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecifierStudy S=new SpecifierStudy();
		S.demo1();//calling private method within class
		S.demo2();
		S.demo3();
		S.demo4();
		
		
	}	
		
    private void demo1() {
    System.out.println("this is private method ");
    }
   void demo2() {
	   System.out.println("this is default method");
   }
   protected void demo3() {
	   System.out.println("this is protected method");
   }
   public void demo4() {
	   System.out.println("this is public method");
   }
	
   
   
   
   
   

}
