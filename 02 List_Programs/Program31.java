package List_Programs;
import java.util.*;
public class Program31 {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(24);
		l1.add(21);
		l1.add(24);
		l1.add(36);
		l1.add(15);
		l1.add(13);
		l1.add(24);
		System.out.println(l1.get(0)+100);
        System.out.println("Original list:"+l1);
        
        ListIterator<Integer> lit = l1.listIterator(l1.size());
        while(lit.hasPrevious()) {
        	int p = lit.previous();
        	if(p%2==1)
        		lit.add(100);
        }
        System.out.println("Updated List:"+l1);
	}
}
