package Queue_interface;
import java.util.*;

public class Program7 {

	public static void main(String[] args) {
		
		Queue q1 = new PriorityQueue();
		Deque<Integer> dq = new ArrayDeque<>();
		
		dq.offer(25);
		dq.offer(23);
		dq.offer(20);
		dq.offer(24);
		dq.offer(33);
		dq.offer(19);
		Iterator<Integer> it = dq.descendingIterator();
		
		System.out.println("Dedue is:"+dq);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}