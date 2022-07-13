package logicalPackage;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc	=new Scanner(System.in);
		System.out.println("Plase enter value of string");
		String original = sc.next();
		String reverse="";
		
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		System.out.println("Original value of string is "+original);
		System.out.println("Reverse value of string is "+reverse);

		
		if(reverse.equals(original)) {
			System.out.println("Given string is Palindrome");
		}
		
		else {
			System.out.println("Given string is not Palindrome");
		}
	}

}
