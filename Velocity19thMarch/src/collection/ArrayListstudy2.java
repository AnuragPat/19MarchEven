package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import loopStudy.while_loop;

public class ArrayListstudy2 {

	public static void main(String[] args) {
		ArrayList alt=new ArrayList();
		alt.add("Pune");
		alt.add(null);
		alt.add(null);
		alt.add("Pune");
		alt.add('A');
		alt.add(false);
		System.out.println(alt);
		System.out.println(alt.get(4));
		System.out.println(alt.isEmpty());
		alt.remove(2);
		System.out.println(alt);
		alt.add(0, "Kolhapur");
		System.out.println(alt);
		System.out.println("===================");
		//*1.method using loop
		for(int i=0;i<=alt.size()-1;i++) {
			System.out.println(alt.get(i));
		}
		System.out.println("====================");
		
		//*2.using iterator
		Iterator It = alt.iterator();
		while(It.hasNext()) {
			System.out.println(It.next());
		}
		System.out.println("======================");

		//3.Using ListItrator
		    ListIterator List = alt.listIterator();
		    while(List.hasNext()) {
		    	System.out.println(List.next());
		    }
	   System.out.println("===================");
	   
	   //**4. Using For Each loop
	   for(Object j:alt) {
		   System.out.println(j);
	   }
	}

}
