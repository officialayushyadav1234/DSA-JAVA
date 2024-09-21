package List_Programs;
import java.util.*;
public class Program26 {

	public static void main(String[] args) {
		
		List<Integer> l1 =new ArrayList<>();
		l1.add(25);
		l1.add(45);
		l1.add(25);
		l1.add(12);
		l1.add(24);
		l1.add(35);
		
		ListIterator<Integer> lit = l1.listIterator(3);
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
	}
}
