package utility_class;
import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		
		int[] a= {12, 34, 10, 35, 44, 28, 70};
		System.out.println("===Elements Before Sorting====");
		for(int x:a)
			System.out.print(x+" ");
		
		Arrays.sort(a);
		System.out.println("\n===Elements After Sorting====");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println("\n==============================");
		System.out.println(Arrays.toString(a));
	}
}
