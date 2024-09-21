package Comparator_Interface;
import java.util.*;
public class PriceComparator implements Comparator<Car> {

	public int compare(Car c1,Car c2) {
		
		return (int) (c1.price-c2.price);
	}
}
