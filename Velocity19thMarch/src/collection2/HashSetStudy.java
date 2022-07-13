package collection2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add("Velocity");
	hs.add('A');
//	hs.add("Velocity");
	hs.add(null);
//	hs.add(null);
	hs.add(123);
	hs.add(123.45);
	hs.add(true);
	System.out.println(hs);
    System.out.println(hs.remove(123));//return type of remove is boolean
    System.out.println(hs);// shows removal operation
     System.out.println(hs.isEmpty());
     System.out.println(hs.size());//allows only one duplicate and null value
     hs.remove("Velocity");
     System.out.println(hs);
     System.out.println("===================");

//1*
 //    for(int i=0;i<=hs.size()-1;i++) {
//    	 System.out.println(hs.get(i));}
     
     //2*
     for(Object k:hs) {
    	 System.out.println(k);
     }
     System.out.println("=========================");
     
     //3*
     Iterator it=hs.iterator();
     while(it.hasNext()) {
    	 System.out.println(it.next());
     }
     System.out.println("=======================");
     
	}

}
