package LoopStudy;

public class loop2 {
	
	
	public static void main(String[] args) {
		// 
	   
		for(int a=2;a<=10;a=a+2) {
			System.out.println(a);
		}
		for(int b=100;b>=10;b=b-10) {
			System.out.println(b);
		}
		int c=5;
		while(c<=25) {
			System.out.println(c);
			c=c+5;
		}
		String Name="Velocity";
		int d=1;
		while(d<=10) {
			System.out.println(Name);
			d++;
		}
		
		int j=50;
		do {System.out.println(j);
			j++;
		}
		while(j<=60);
		int y=10;
		do {
			System.out.println(y);
			y--;
		}
		while(y>=1);
		
   }
}
