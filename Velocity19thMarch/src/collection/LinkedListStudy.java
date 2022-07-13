package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		    LinkedList ll=new LinkedList();
		    ll.add("pune");
		    ll.add("pune");
		    ll.add(null);
		    ll.add(null);
		    ll.add(123);
		    ll.add(123.67);
		    ll.add(true);
		    ll.add('C');
		    System.out.println(ll);
		   ll.add(0, "Velocity");
		   System.out.println(ll);
		   System.out.println(ll.getFirst());//givest 1st n last element
		   System.out.println(ll.getLast());
		   System.out.println(ll.indexOf('C'));
		   System.out.println(ll.contains("Pune"));//case sensetive
		   System.out.println(ll.size());
		   System.out.println(ll.remove(0));
		   System.out.println(ll.isEmpty());
		   System.out.println("=====================");
		   ll.peek();//action on 1st element remove
		   System.out.println(ll);
		   ll.poll();//action on 1st element remove
		   System.out.println(ll);
		   ll.pop();//action on 1st element remove
		   System.out.println(ll);
		   System.out.println("==============");
		   
		  //* 1for
		   for(int i=0;i<=ll.size()-1;i++) {
			   System.out.println(ll.get(i));
		   }
		   System.out.println("=========================");
		   
		  //2*.foe each 
		   for(Object m:ll) {
			   System.out.println(m);
		   }
		   System.out.println("======================");
		   
		   //*3.Iterator
		   Iterator mn=ll.iterator();
		   while(mn.hasNext()) {
			   System.out.println(mn.next());
		   }
		   System.out.println("===================");
		   
          //4*List iterator
		   ListIterator no=ll.listIterator();
		   while(no.hasNext()) {
			   System.out.println(no.next());
		   }
	}

}
