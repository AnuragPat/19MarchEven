package Casting_Study;

public class PremitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       System.out.println("==================");
               int a=100;//-------->lower data type information
               System.out.println(a);
               
               double b=a;//---->lower data type converted into higher data type info-->implicit/widening casting
               System.out.println(b);
               System.out.println("==================");
               
               
               System.out.println("===================");
               double c=145678.546d;//------>higher data type information
               System.out.println(c);
               
               int d=(int) c;//------>higher datatype converted into lower datatype--->explicit/narrowing casting
               System.out.println(d);
               System.out.println("===================");
               
               float e=199.65439f;//-------->higher datatype------>using float
               int f=(int)e;//------->higher datatype converted into lower data type
               System.out.println(f);
               
               System.out.println("=====================");
               float h=5643.78f;//------>converting higher to lower datatype
               byte k=(byte)h;
               System.out.println(k);
               short l=(short)h;
               System.out.println(l);
               System.out.println("=====================");
               
               double t=765449.6;
               float u=(float)t;
               System.out.println(u);
               System.out.println("=====================");
               
               long o=674;
               double p=o;
               System.out.println(p);
               float m=o;
               System.out.println(m); 
               System.out.println("====================");
               
               short r=5678;//------>converting short to long
               double w=r;
               float q=r;
               System.out.println(w);
               System.out.println(q);
               System.out.println("=====================");
               
	}
}
