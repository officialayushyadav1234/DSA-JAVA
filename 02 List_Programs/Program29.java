package List_Programs;

import java.util.*;

public class Program29 {

	public static void main(String[] args) {
		
	 List l1 = new ArrayList();
	 l1.add(23);
	 l1.add(21);
	 l1.add(12);
	 l1.add(16);
	 l1.add(18);
	 l1.add(64);
	 l1.add(34);
	 System.out.println("Original List:"+l1);
	 
	 ListIterator lit = l1.listIterator();
	 while(lit.hasNext()) {
		 int p = (int)lit.next();
		 if(p%2==1)
			 lit.set(p*2);
	 }
	 System.out.println("Updated List:"+l1);
	}
}
