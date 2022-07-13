package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Pune");
		v.add(null);
		v.add(null);
		v.add('M');
		v.add(123);
		v.add(123.65);
		v.add(true);
		System.out.println(v);
		
		//*1.for loop
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("=============");
		
		//2.for each loop
		for(   Object j:v) {
			System.out.println(j);
		}
		System.out.println("===================");
		
		//*3.Enumeration
            Enumeration el = v.elements();
            while(el.hasMoreElements())
          {
           	System.out.println(el.nextElement());}
            System.out.println("===================");
            
        //4.Iterator
             Iterator it = v.iterator();//here object is 'v'
           while (it.hasNext()) {
			System.out.println( it.next());
			}
           System.out.println("================");
		
           //5*List iterator
           ListIterator lt=v.listIterator();
           while(lt.hasNext()) {
        	   System.out.println(lt.next());
           }
		}

}
