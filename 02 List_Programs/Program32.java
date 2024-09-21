package List_Programs;
import java.util.*;
public class Program32 {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(21);
		l1.add(23);
		l1.add(24);
		l1.add(12);
		l1.add(25);
		System.out.println("Original list:"+l1);
		System.out.println("===============================");
		System.out.println(l1.get(0)+100);
		System.out.println(l1.get(3)+100);
		
	}
}
