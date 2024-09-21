package List_Programs;

import java.util.ArrayList;
import java.util.Collection;

public class Program16 {

	public static void main(String[] args) {
		
		Collection c1 =new ArrayList();
		
		c1.add(12);
		c1.add(18);
		c1.add(20);
		c1.add("abc");
		c1.add(25.67);
		
		// For each Loop
		for(Object p:c1) {
			System.out.println(p);
		}
		System.out.println("Program ends!");
	}
}
