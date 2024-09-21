package Queue_interface;
import java.util.*;

public class Program3 {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new PriorityQueue<>();
		
		q1.offer(25);
		q1.offer(36);
		q1.offer(36);
		q1.offer(36);
//		q1.offer(null);
//		q1.offer("abc");
		q1.offer(38);
		q1.offer(45);
		q1.offer(25);
		q1.offer(10);
		System.out.println(q1);
		
		System.out.println(q1.remove());
		System.out.println(q1);
	}
}
