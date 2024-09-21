package Comparator_Interface;
import java.util.*;

public class CarNumberComparator implements Comparator<Car>{

	public int compare(Car c1, Car c2) {
		return c1.car_no-c2.car_no;
	}
}
