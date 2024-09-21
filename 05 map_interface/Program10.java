package map_interface;
import java.util.*;

public class Program10 {

	public static void main(String[] args) {
		
		Map<String, Integer> hm=new LinkedHashMap<>();
		hm.put("abc", 34);
		hm.put("ijk", 222);
		hm.put("cde", 55);
		hm.put(null, 57658);
		hm.put("efg", 100);
		hm.put("xyz", 333);
		for(Map.Entry<String, Integer>  x : hm.entrySet())
			System.out.println(x.getKey()+"==>"+x.getValue());
	}
}