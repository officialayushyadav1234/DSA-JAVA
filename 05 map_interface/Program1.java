package map_interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {
		
		Map m1 = new HashMap();
		Collection c1 = m1.values();
		Set s1 = m1.keySet();
		
		Map<Integer,String> m2 = new HashMap<>();
		Collection<String> c2 = m2.values();
		Set<Integer> s2 = m2.keySet();
		
	}
}
