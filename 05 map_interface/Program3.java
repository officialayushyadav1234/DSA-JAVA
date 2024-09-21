package map_interface;
import java.util.*;
public class Program3 {

	public static void main(String[] args) {
		
		Map<Integer, String> m1=new HashMap<>();
		m1.put(12, "cde");
		m1.put(22, "xyz");
		m1.put(16, "pqr");
		m1.put(18, "abc");
		m1.put(23, "ijk");
		m1.put(20, "def");
		m1.put(19, "cde");
		System.out.println(m1);
		Set<Integer> s1 = m1.keySet();
	    System.out.println("All Keys :"+s1);
	    for(int x:s1)
	    	System.out.println(x);
	}
}
