package List_Programs;

import java.util.ArrayList;
import java.util.Collection;

public class Program10 {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(55);
		c1.add(12);
		c1.add(24);
		c1.add(51);
		c1.add(42);
		
		System.out.println(c1.contains(55));  // true
		System.out.println(c1.contains(52));  // false
	}
}

