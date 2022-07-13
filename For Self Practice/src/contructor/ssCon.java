package contructor;

public class ssCon {
	int a;
	int b;
	int c;
		public ssCon(int x,int y,int z) {
			a=x;
			b=y;
			c=z;
			System.out.println("addition is "+(a+b+c));
		}
	
	public static void main(String[] args) {
		ssCon FF=new ssCon(50,50,50);
        FF.test();
		
	}
        
	public void test() {
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println("the addition is "+c);
		
	}
	
	
	
	
	
}
