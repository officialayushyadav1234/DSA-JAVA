package List_Programs;

import java.util.*;
public class Program23 {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		l1.add(21);
		l1.add(23);
		l1.add(46);
		l1.add(47);
		l1.add(55);
		l1.add(45);
		l1.add(78);
		l1.set(1,100);
		System.out.println(l1);
		System.out.println("=============");
		for(int i=0; i<l1.size(); i++) {
			int x = (int)l1.get(i);
			if(x%2 == 1)
				l1.set(1, 2*x);
		}
		System.out.println(l1);
	}
}
