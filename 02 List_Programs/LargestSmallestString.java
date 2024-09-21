package List_Programs;
import java.util.*;

public class LargestSmallestString {

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
		String s_st="";
		String b_st="";
		int count=0;
		
		Iterator itr = c1.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof String) {
				String temp = (String)o;
				count++;
				if(count==1)
					s_st=temp;
				if(temp.length()>b_st.length())
					b_st = temp;
			}
		}
		System.out.println("Biggest String is:"+b_st);
		System.out.println("Smallest String is:"+s_st);
	}
}
