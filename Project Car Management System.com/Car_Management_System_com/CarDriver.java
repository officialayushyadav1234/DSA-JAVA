package Car_Management_System_com;

public class CarDriver {

	public static void main(String[] args) {
		
		Car_Manager cm = new Car_Manager();
		
		Car c1 = new Car("TATA",2250000.12,2021,"Petrol","Safari");
		
		cm.l.add(c1);
		cm.l.add(new Car("KIA",122666.56 , 2021, "Petrol", "seltos"));
		cm.l.add(new Car("TATA", 134666.56, 2022,"diesel", "nexon"));
		
		cm.selectOption();
	}
}