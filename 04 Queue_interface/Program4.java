package Queue_interface;
import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.offer(36);
		q1.offer(35);
		q1.offer(37);
		q1.offer(35);
		q1.offer(24);
		q1.offer(29);
		q1.offer(86);
		q1.offer(15);
		q1.offer(17);
		q1.offer(19);
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
 	}
}
