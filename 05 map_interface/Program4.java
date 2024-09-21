package map_interface;
import java.util.*;

public class Program4 {

	public static void main(String[] args) {
		
		Map<Integer,String> m1= new HashMap<>();
		m1.put(12, "cde");
		m1.put(22, "xyz");
		m1.put(16, "pqr");
		m1.put(18, "abc");
		m1.put(23, "ijk");
		m1.put(20, "def");
		m1.put(19, "cde");
		System.out.println(m1);
		Collection<String> c1 = m1.values();
		System.out.println("All Values:"+c1);
		Iterator<String> itr = c1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
