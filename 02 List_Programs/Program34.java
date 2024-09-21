package List_Programs;
import java.util.*;
public class Program34 {

	public static void main(String[] args) {
		
		int[] a= {12, 34, 12, 40, 34, 12, 44, 12};
		System.out.println("All elemets: ");
		for(int x:a)
			System.out.print(x+" ");
		int[] unique=getUnique(a);
		System.out.println("\nUnique elemets: ");
		for(int x:unique)
			System.out.print(x+" ");
    }
    public static int[] getUnique(int[] l)
    {
	 List<Integer> a=new ArrayList<>();
	 for(int x: l) {
		if(!a.contains(x))
			a.add(x);
	}
	
	 int[] x=new int[a.size()];
	 for(int i=0;i<x.length;i++)
		x[i]=a.get(i);
	
   return x;
 }
		
}

