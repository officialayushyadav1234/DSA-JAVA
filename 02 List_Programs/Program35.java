package List_Programs;
import java.util.*;

public class Program35 {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(35);
		l1.add(25);
		l1.add(16);
		System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<>(l1);
		System.out.println(l2);
	}
}
