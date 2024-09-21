package List_Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program1 {

	public static void main(String[] args) {
		
		int[] a=new int[100];
		Collection c = new ArrayList();
		c.add(12);
		c.add(34.6);
		c.add("Mohan");
		c.add(45);
		System.out.println(c);
		System.out.println("===============");
		
		Iterator itr = c.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	}
}
