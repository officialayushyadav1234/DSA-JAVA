package List_Programs;

import java.util.ArrayList;
import java.util.Collection;

public class Program13 {

	public static void main(String[] args) {
		
		Collection  c1 = new ArrayList();
		
		c1.add(12);
		c1.add(45);
		c1.add(21);
		c1.add(15);
		c1.add(22);
		
		Collection c2 =new ArrayList();
		
		c2.add(12);
		c2.add(21);
		c2.add(15);
		c2.add(14);
		
		System.out.println(c1.containsAll(c2));
		System.out.println("Size of c1 is :" +c1.size());
	}
}
