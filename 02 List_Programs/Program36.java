package List_Programs;
import java.util.*;


public class Program36 {

	public static void main(String[] args) {
		
		Stack<Integer> s1 = new Stack<>();
		s1.push(45);
		s1.push(64);
		System.out.println("S1 is :"+s1);
		
		s1.push(100);
		System.out.println("S1 is:"+s1);
		s1.push(120);
		s1.push(200);
		s1.pop();
		System.out.println("S1 is :"+s1);
		
		System.out.println(s1.peek());
		System.out.println(s1.search(200));
		System.out.println(s1.search(64));
	}
}
