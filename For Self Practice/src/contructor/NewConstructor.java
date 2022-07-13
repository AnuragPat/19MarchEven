package contructor;

public class NewConstructor {
	
	int a;
	int b;
	int c;

	public NewConstructor(int x,int v) {
		a=x;
		b=v;
		
	}
	public NewConstructor(int x,int v,int z) {
		a=x;
		b=v;
		c=z;
	}
	
	public NewConstructor () {
		a=100;
		b=100;
	}
	public static void main(String[] args) {NewConstructor M=new NewConstructor();
		 M.total2();
		NewConstructor WW=new NewConstructor(20,20);
		WW.total();
        NewConstructor MM=new NewConstructor(10,10,10);
        MM.total1();
       
	}

	public void total() {
		int c=a/b;
		System.out.println("The value of c is "+c);
	}
	
	public void total1(){
		int d=a+b+c;
		System.out.println("The value of d is "+d);
	}
	
	public void total2() {
		int m=a+b;
		System.out.println("The value of m is "+m);
	}
}

