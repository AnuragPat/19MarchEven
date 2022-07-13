package variables_SStudy;

public class VariableStudy {
	  int d=50;//non static variable
	  static int f=30;//static variable
	  

	public static void main(String[] args) {
	       VariableStudy NN=new VariableStudy();
	       System.out.println("value of d is "+NN.d);
           System.out.println("value of f is "+ f);
           
           
         int  addition=100+f;
         int div=1000/NN.d;
         System.out.println("The addition is "+addition);
         System.out.println("The div is "+div);
         
         System.out.println("value of static variable from another class is "+ Sample.u);//static variables from another class
         System.out.println("Value of static variable is "+Sample.x);
         Sample FF=new Sample();//obj created
         System.out.println("the value of non-static variable is "+FF.z);//use of non static variable from another class
         
         int mul=FF.z*f;//we use non static and static variable together
         System.out.println("multification is "+mul);
         
         
        int div2=Sample.x/Sample.x;
        System.out.println("the div is "+div2);
	}

}
