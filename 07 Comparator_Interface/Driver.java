package Comparator_Interface;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		String i;
		List<Car> l1=new ArrayList<>();
		Car c1=new Car("tata", 4347787.56, 3453);
		l1.add(c1);
		l1.add(new Car("tata", 8465078.67, 4576));
		l1.add(new Car("tata", 6465778.67, 4578));
		l1.add(new Car("honda", 5665778.67, 4276));
		l1.add(new Car("tata", 4015778.67, 4556));
		l1.add(new Car("audi", 5865778.67, 4076));
		l1.add(new Car("bmw", 6465778.67, 1576));
		System.out.println("All cars are below========");
		for(Car x:l1)
			System.out.println(x);
		Collections.sort(l1, new BrandComparator());
		System.out.println("All Sorted cars On Brand are below========");
		for(Car x:l1)
			System.out.println(x);
		Collections.sort(l1, new CarNumberComparator());
		System.out.println("All Sorted cars On Car Number are below========");
		for(Car x:l1)
			System.out.println(x);
		Collections.sort(l1, new PriceComparator());
		System.out.println("All Sorted cars On price are below========");
		for(Car x:l1)
			System.out.println(x);
	}
}
