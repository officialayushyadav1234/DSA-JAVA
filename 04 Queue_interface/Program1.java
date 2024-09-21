package Queue_interface;
import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		
		Queue q1=new LinkedList();
		q1.add(34);
		q1.add(45);
		q1.add(55);
		System.out.println(q1);
		q1.add(100);
		q1.add(45);
		q1.add("abc");
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		
		System.out.println(q1.peek());
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1);
	}
}
