package Comparable_Interface;

public class Car implements Comparable<Car>{

	String brand;
	double price;
	int car_no;
	Car()
	{
		
	}
	Car(String brand, double price, int car_no){
		this.brand=brand;
		this.price=price;
		this.car_no=car_no;
	}
	public String toString() {
		return brand+"\t"+price+"\t"+car_no;
	}
	public int compareTo(Car c) {
		if(this.brand.equalsIgnoreCase(c.brand))
			return (int)(this.price-c.price);
		return this.brand.compareToIgnoreCase(c.brand);
	}
	
	/*public int compareTo(Car c) {
		return (int)(this.price-c.price);
	}*/
	/*public int compareTo(Car c) {
	return this.car_no-c.car_no;
	}*/

}
