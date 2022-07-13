package contructor;

     public class StudyCon {
           int a;
           int b;
           
           
           public StudyCon(){
        	   a=800;
        	   b=200;
        	   System.out.println("The addition is "+(a+b));
           }
           
           public void testing() {
        	   System.out.println("This is user define constructor without parameter .");
           }
           
	public static void main(String[] args) {
          StudyCon NN=new StudyCon();
          NN.testing();
          StudyCon JJ=new StudyCon(800, 900);
          JJ.software();

	}
   public StudyCon(int p,int q) {
	   a=p;
	   b=q;

   }
   public void software() {
	   System.out.println("The addition of p and q is "+(a+b));
	   System.out.println("The value of p is "+a);
	  System.out.println("The value of q is "+b);
   }
}
 