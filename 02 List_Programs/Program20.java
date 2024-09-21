package List_Programs;

import java.util.ArrayList;
import java.util.List;

public class Program20 {

	public static void main(String[] args) {
		
		List l1 =new ArrayList();
		
		l1.add(23);
		l1.add(45);
		l1.add(null);
		l1.add(1,47);
		l1.add(null);
		l1.add(4,55);
		System.out.println("l1 is :"+l1);
		l1.remove(2);
		System.out.println("l1 is :"+l1);
		
	}
}
