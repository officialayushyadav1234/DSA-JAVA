package Car_Management_System_com;


public class Car {
        
		String brand;
		double price;
		int year;
		String type;
		String model_name;
		
		Car (String brand,double price, int year ,String type,String model_name){
			
			this.brand = brand;
			this.price = price;
			this.year = year;
			this.type = type;
			this.model_name = model_name;
		}
		
		public String toString() {
			
			return "Brand is: " +brand+ " Price is: " +price+ " Year is: " +year+ " Type is: " +type+ " Model is: " +model_name;
		
		
	}
    	
}
