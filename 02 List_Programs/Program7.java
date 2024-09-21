package List_Programs;

import java.util.ArrayList;
import java.util.Collection;

public class Program7 {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(45);
		c1.add(22);
		c1.add(52);
		c1.add(55);
		c1.add(75);
		c1.add(45);
		c1.add(12);
		System.out.println(c1.remove(52));
		System.out.println(c1.remove(45));
		System.out.println("c1 is :" +c1);
	}
}
