package List_Programs;

import java.util.ArrayList;
import java.util.List;

public class Program21 {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		l1.add(44);
		l1.add(52);
		l1.add(55);
		l1.add(25);
		l1.add(75);
		l1.add(55);
		
		System.out.println(l1.indexOf(55));
		System.out.println(l1.indexOf(25));
		System.out.println(l1.indexOf(100)); // false return -1
	}
}
