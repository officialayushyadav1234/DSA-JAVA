package List_Programs;

import java.util.ArrayList;
import java.util.Collection;

public class Program6 {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		c1.add(44);
		c1.add(55);
		
		Collection c2 = new ArrayList();
		c2.add(56);
		c2.add(46);
		System.out.println("c1 is:"+c1);
		System.out.println("c2 is:" +c2);
		c1.addAll(c2);
		System.out.println("Updated c1 is:" +c1);
		c1.add(100);
		System.out.println("Updated c1 is:" +c1);
		
	}
}
