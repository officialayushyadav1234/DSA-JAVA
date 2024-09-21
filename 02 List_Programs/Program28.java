package List_Programs;

import java.util.*;

public class Program28 {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		l1.add(27);
		l1.add(15);
		l1.add(21);
		l1.add(36);
		l1.add(23);
		l1.add(75);
		l1.add(26);
		System.out.println("Original List:"+l1);
		ListIterator lit = l1.listIterator(l1.size());
		while(lit.hasPrevious()) {
			if((int)lit.previous()%2==1)
				lit.remove();
		}
		System.out.println("Updated List:"+l1);
		
	}
}
