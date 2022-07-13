package array;

public class ArrayStudy1 {

	public static void main(String[] args) {
		// array declaration
		char grade[]=new char[4];
		//array initialization
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		//usage
		System.out.println("grade at index 0 is "+grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		//System.out.println(grade[4]);***run time exception
        System.out.println("=============================="); 
		for(int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}
		System.out.println("==============================");
		
		
		
		for(int i= grade.length-1;i>=0;i--) {
			System.out.println(grade[i]);
		int rollno[]=new int[5];
		rollno[0]=1;//***array initialization
		rollno[1]=2;
		rollno[2]=3;
		rollno[3]=4;
		rollno[4]=5;
		System.out.println("=========================");
		for(int a=rollno.length-1;a>=0;a--) {
			System.out.println(rollno[a]);}
		}
		
	}

}
