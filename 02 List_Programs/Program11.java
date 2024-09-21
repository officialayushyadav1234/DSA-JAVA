package List_Programs;

import java.util.ArrayList;
import java.util.Collection;

public class Program11 {

	public static void main(String[] args) {
		
		Collection c1 =new ArrayList();
		
		c1.add(44);
		c1.add(52);
		c1.add(14);
		c1.add(14);
		c1.add(45);
		c1.add(41);
		
		Collection c2 = new ArrayList();
		
		c2.add(14);
		c2.add(44);
		c2.add(14);
		c2.add(55);
		
		System.out.println(c1.containsAll(c2)); // if c1 == c2 return true otherwise false
	}
}
