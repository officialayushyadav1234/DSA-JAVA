package List_Programs;

import java.util.*;

public class Program30 {

	public static void main(String[] args) {
		
		List l1 =new ArrayList();
		l1.add(21);
		l1.add(24);
		l1.add(36);
		l1.add(15);
		l1.add(13);
		l1.add(24);
		System.out.println("Original List:"+l1);
		
		ListIterator lit = l1.listIterator();
		while(lit.hasNext()) {
			int p = (int)lit.next();
			if(p%2==1)
			lit.add(100);
		}
		System.out.println("Updated List:"+l1);
	}
}
