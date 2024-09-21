package fail_Fast_fail_Safe;
import java.util.concurrent.*;
import java.util.Iterator;

public class Program2 {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> l1 = new CopyOnWriteArrayList<>();
		
		l1.add("A");
		l1.add("B");
		Iterator<String> itr=l1.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			if(s.equals("A")) {
				l1.add("c");
			}
		}
		System.out.println(l1);
	}
}
