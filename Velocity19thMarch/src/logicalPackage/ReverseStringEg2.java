package logicalPackage;

import java.util.Scanner;

public class ReverseStringEg2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter reversed string to be");
		String name = sc.next();
		String b="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			b=b+name.charAt(i);
		}
		System.out.println("Original value of string is "+name);
		System.out.println("Reversed  value of string is "+b);

	}

}
