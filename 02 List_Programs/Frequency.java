package List_Programs;
import java.util.*;

public class Frequency {

	public static void main(String[] args) {
		
		
		List<Integer> l2=new Stack<>();
		List<Integer> l=new Vector<>();
		List<Integer> l1=new ArrayList<>();
		l1.add(23);l1.add(30);l1.add(55);
		l1.add(55);l1.add(55);l1.add(55);l1.add(55);
		l1.add(23);
		getFrequency(l1);
	}
	public static void getFrequency(List<Integer> l1) {
		for(int i=0;i<l1.size();i++) {
			int count=1;
			for(int j=i+1;j<l1.size();j++) {
				if(l1.get(i)==l1.get(j)) {
					count++;
					l1.remove(j);	j--;
				}
			}
			System.out.println(l1.get(i)+" is==> "+count+" times");
		}
	}
}
