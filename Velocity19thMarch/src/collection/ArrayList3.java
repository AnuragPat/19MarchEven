package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Character> ac=new ArrayList<>();//specific
		ac.add('A');
		ac.add('B');
		ac.add('C');
		ac.add('D');
		for(int i=0;i<=ac.size()-1;i++) {
			System.out.println(ac.get(i));
		}
		System.out.println("==============");
		//2.
       for(Character h:ac) {
    	   System.out.println(h);
       }
       System.out.println("===============");
     
       //*3.
       Iterator<Character>it1=ac.iterator();
       while(it1.hasNext()) {
        System.out.println(it1.next());}
       System.out.println("=================");
       
       //*4.
      ListIterator<Character> j = ac.listIterator();
     while(j.hasNext()) {
      System.out.println( j.next());
	}
	}
}
