package Set_Interface;
import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] a = {24, 54, 65, 85, 89, 65, 85, 25, 65};
		removeDuplicates(a);
	}
	public static void removeDuplicates(int[] a) {
		
		Set<Integer> s = new HashSet<>();
		for(int i=0; i<a.length; i++) {
			s.add(a[i]);
		}
		System.out.println("All Unique Elements are: ");
		for(int p:s)
			System.out.print(p+" ");
	}
}