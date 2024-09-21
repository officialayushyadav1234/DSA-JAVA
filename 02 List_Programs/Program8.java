package List_Programs;

import java.util.ArrayList;
import java.util.Collection;

public class Program8 {

	public static void main(String[] args) {
	 
		Collection c1 = new ArrayList();
		
		c1.add(44);
		c1.add(21);
		c1.add(45);
		c1.add(12);
		c1.add(21);
		
		Collection c2 =new ArrayList();
		
		c2.add(14);
		c2.add(44);
		c2.add(12);
		c2.add(20);
		
		c1.removeAll(c2);
		System.out.println("c1 is :" +c1);
	}
}
