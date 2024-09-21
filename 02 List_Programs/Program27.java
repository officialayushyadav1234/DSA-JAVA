package List_Programs;

import java.util.*;

public class Program27 {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		l1.add(25);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(45);
		l1.add(24);
		l1.add(20);
		l1.add(16);
		
		System.out.println("Original List l1:"+l1);
		ListIterator lit =  l1.listIterator();
		while(lit.hasNext()) {
			if((int)lit.next()%2==1)
				lit.remove();
		}
		System.out.println("Updated List :"+l1);
	}
}
