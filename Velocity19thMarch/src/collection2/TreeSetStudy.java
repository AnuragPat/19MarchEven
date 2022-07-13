package collection2;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		TreeSet TS= new TreeSet();
		TS.add("Velocity");
		TS.add("Corporate");
		TS.add("Katraj");
		TS.add("pune");
		TS.add("Training");
		TS.add("Centre");
		System.out.println(TS);
		System.out.println("====================");
		
		
		
		//1*
		for(Object k:TS) {
			System.out.println(k);
		}
		System.out.println("===================");
		
		//2*
		Iterator t=TS.iterator(); 
		while(t.hasNext()) {
			System.out.println(t.next());
		}
	}

}
