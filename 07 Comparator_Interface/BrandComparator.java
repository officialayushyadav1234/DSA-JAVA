package Comparator_Interface;
import java.util.*;

public class BrandComparator implements Comparator<Car>{

	public int compare(Car c1, Car c2) {
		if(c1.brand.equalsIgnoreCase(c2.brand))
			return (int)(c1.price-c2.price);
		return c1.brand.compareTo(c2.brand);
	}
}
