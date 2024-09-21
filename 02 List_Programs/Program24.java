package List_Programs;

import java.util.*;
public class Program24 {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		l1.add(23);
		l1.add(46);
		l1.add(47);
		l1.add(55);
		l1.add(45);
		l1.add(78);
		
		ListIterator lit = l1.listIterator();
        System.out.println(lit.next());
        System.out.println(lit.previous());
        System.out.println("=======================");
        System.out.println(lit.next());
        System.out.println(lit.next());
        System.out.println(lit.next());
        System.out.println(lit.next());
        System.out.println(lit.next());
        System.out.println(lit.previous());
	}
}
