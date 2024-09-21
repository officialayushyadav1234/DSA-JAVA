package Queue_interface;
import java.util.*;

public class Program5 {

	public static void main(String[] args) {
		
		Queue<String> q1 = new PriorityQueue<>();
		
		q1.offer("Mohan");
		q1.offer("mohan");
		q1.offer("abc");
		q1.offer("ABC");
		q1.offer("ABCD");
		q1.offer("abc");
		q1.offer("Sohan");
		System.out.println(q1);
		
		Iterator<String> itr = q1.iterator();
		while(itr.hasNext()) {
			String s1 = itr.next();
			System.out.println(s1+" ");
			itr.remove();
			}
		
	}
}
