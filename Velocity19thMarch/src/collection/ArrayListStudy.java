package collection;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();//generic
		al.add("Velocity");
		al.add('A');
		al.add("Velocity");
		al.add(null);
		al.add(null);
		al.add(123);
		al.add(123.45);
		al.add(true);
		System.out.println(al);//to see how it shows
		System.out.println(al.size());//to see its size
        System.out.println(al.isEmpty());
		System.out.println(al.contains("Velocity"));
		System.out.println(al.contains("ci"));
		System.out.println(al.get(5));// to check which element present at that index
		System.out.println(al.indexOf(true));//to check index of given element
		System.out.println(al.remove(0));// index passed element removed
		System.out.println(al);// to check new index
		System.out.println(al.remove(null));
		System.out.println(al);
		al.add(0, "Pune");
		System.out.println(al);
		System.out.println("======================="); 
		
		
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println (al.get(i));
		}
	}

}
