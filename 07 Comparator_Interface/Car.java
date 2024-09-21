package Comparator_Interface;

public class Car {

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
}
