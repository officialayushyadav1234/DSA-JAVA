package Queue_interface;
import java.util.*;

public class Program6 {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.offer(23);
		q1.offer(12);
		q1.offer(18);
		q1.offer(10);
		q1.offer(12);
		q1.offer(15);
		q1.offer(13);
		System.out.println(q1);
		Iterator<Integer> itr = q1.iterator();
		while(itr.hasNext()) {
			int s1 = itr.next();
			System.out.println(s1+" ");
			itr.remove();
		}
		
		
	}
}
