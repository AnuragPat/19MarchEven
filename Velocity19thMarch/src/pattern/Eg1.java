package pattern;

public class Eg1 {

	public static void main(String[] args) {
		//* * * * *
		
		for(int i=1;i<=5;i++) {
			System.out.println("*");
		}
        System.out.println("=============================");
		
		for(int i=1;i<=5;i++) {
			System.out.print("* ");
		}
		System.out.println(" ");
		System.out.println("=========================");
		// row=5,cell=5
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
			System.out.print("* ");	
			}
			System.out.println();
		}
		System.out.println("==========================");
		//row=5,cell=5
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
