package Set_Interface;
import java.util.*;

public class Program4 {

	public static void main(String[] args) {
		
		List<Integer>l1 = new ArrayList<>();
		l1.add(254);
		l1.add(584);
		l1.add(564);
		l1.add(256);
		l1.add(485);
		l1.add(47);
		l1.add(78);
		System.out.println("List is:"+l1);
		Set<Integer> s1 = new TreeSet<>(l1);
		System.out.println(s1);
		
	}
}
