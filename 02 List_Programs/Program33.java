package List_Programs;
import java.util.*;
public class Program33 {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(12);
		l1.add(32);
		l1.add(12);
		l1.add(34);
		l1.add(24);
		l1.add(42);
		l1.add(34);
		l1.add(42);
		System.out.println("All Elements :"+l1);
		System.out.println("Unique Elements"+getUnique(l1));
		
	}
	public static List<Integer> getUnique(List<Integer> l){
		
		List <Integer> a = new ArrayList<>();
		for(int x:l) {
			if(!a.contains(x))
				a.add(x);
		}
		return a;
	}
}
