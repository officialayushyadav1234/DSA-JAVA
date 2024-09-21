package List_Programs;
import java.util.*;

public class LargestSmallestInteger {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		c1.add("abcd");
		c1.add("xyzpqr");
		c1.add(23);
		c1.add(34.5);
		c1.add("aaa");
		c1.add(55);
		c1.add("bd");
		c1.add('@');
		c1.add("abc");
		c1.add(45.88);
		c1.add(56);
		c1.add(100);
		System.out.println("ALl Elements: "+c1);
		
		int small=Integer.MAX_VALUE;
		int big=Integer.MIN_VALUE;
		Iterator itr = c1.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof Integer) {
				int temp=(int)o;
				if(temp>big)
					big=temp;
				if(temp<small)
					small=temp;
				
			}
		}
		System.out.println("Biggest Integer Number is:"+big);
		System.out.println("Smallest Integer Number is:"+small);
   }
}
