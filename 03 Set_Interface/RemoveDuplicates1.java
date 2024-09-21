package Set_Interface;
import java.util.*;

public class RemoveDuplicates1 {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		l1.add(34); 
		l1.add(24);
		l1.add(34);
		l1.add(100);
		l1.add(34);
		l1.add(100);
		l1.add(50);
		System.out.println(l1);
		Set<Integer> s=new HashSet<>(l1);
		System.out.println(s);
		
	}
}
