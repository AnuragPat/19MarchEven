package collection2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("Velocity");
		hs.add('A');
		hs.add("pune");
		hs.add(null);
		hs.add("velocity");
		hs.add(123);
		hs.add(123.45);
		hs.add(true);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("Pune"));
		System.out.println(hs.contains("Velocity"));
		hs.remove("pune");System.out.println(hs);
		hs.add('A');//not allows duplicates
		System.out.println("==========================");
		//1*
		for(Object o:hs) 
		{
			System.out.println(o);
		}
		System.out.println("===========================");
		
		//2*
		Iterator IT=hs.iterator();
		while(IT.hasNext()) {
			System.out.println(IT.next());
		}

	}

}
