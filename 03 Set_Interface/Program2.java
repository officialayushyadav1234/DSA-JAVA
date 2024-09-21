package Set_Interface;
import java.util.HashSet;
import java.util.*;

public class Program2 {

	public static void main(String[] args) {
		
		Set hs = new LinkedHashSet();
		hs.add(354);
		hs.add(235);
		hs.add(245);
		hs.add(4625);
		hs.add(null);
		hs.add("abc");
		hs.add(253.45);
		hs.add(56);
		hs.add(85);
		System.out.println(hs);
	}
}
