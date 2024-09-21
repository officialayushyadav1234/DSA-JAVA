package utility_class;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		l1.add(45);
		l1.add(42);
		l1.add(33);
		l1.add(50);
		l1.add(43);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);	
	}
}
