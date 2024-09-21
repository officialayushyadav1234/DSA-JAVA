package List_Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program2 {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(12);
		c.add(24);
		c.add("RamMohan");
		c.add(56);
		System.out.println(c);
		System.out.println("===============================");
		
		Iterator itr = c.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
