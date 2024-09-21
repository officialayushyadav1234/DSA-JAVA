package List_Programs;
import java.util.*;
public class Program25 {

	public static void main(String[] args) {
		
		List l1=new ArrayList();
		Object o;
		l1.add(23);
		l1.add(46);
		l1.add(47);
		l1.add(55);
		l1.add(45);
		l1.add(78);
		System.out.println("Create List");
		ListIterator lit = l1.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}	
		System.out.println("=====================");
		System.out.println("Reverse List");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}
}
