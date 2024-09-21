package List_Programs;

import java.util.ArrayList;
import java.util.Collection;

public class Program15 {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(12);
		c1.add(18);
		c1.add(20);
		c1.add("abc");
		c1.add(44.67);
		
		Object[] x=c1.toArray();  // Downcast Object into Array
		
		for(int i=0;i<c1.size();i++)     // size() use for last index value
		{
			System.out.println(x[i]);
		}
		System.out.println("Program ends!");
	}
}
