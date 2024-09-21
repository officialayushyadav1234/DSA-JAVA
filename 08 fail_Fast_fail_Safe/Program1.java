package fail_Fast_fail_Safe;
import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		
		ArrayList<String> l1=new ArrayList<>();
		l1.add("A");
		l1.add("B");
		Iterator<String> itr=l1.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			if(s.equals("A")) {
				l1.add("c");
			}
		}
		System.out.println(l1);  // ConcurrentModificationException
	}
}
