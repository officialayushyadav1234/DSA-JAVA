package List_Programs;

import java.util.ArrayList;
import java.util.List;

public class Program18 {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		
		l1.add(45);
		l1.add(21);
		l1.add(14);
		l1.add(15);
		l1.add(2,25);
		l1.add(1,15);
		l1.add(1,26);
		
		List l2 =new ArrayList();
		
		l2.add(14);
		l2.add(24);
		l2.add(1,32);
		l2.add(0,12);
		
		l1.addAll(2, l2);
		System.out.println("List l1 is :"+l1);
		
	}
}
