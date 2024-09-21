package Car_Management_System_com;
import java.util.*;

public class Car_Manager {

	List<Car> l = new ArrayList<>();	
	public void selectOption() {
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Press 1 to Display All Cars:");
		System.out.println("Press 2 to Display All Cars of a Particular Brand:");
		System.out.println("Press 3 to Display All Cars of a Particular Year:");
		int selectOption = sc.nextInt();
		
		switch(selectOption) {
		
		case 1: System.out.println("-----------Get All Car are Below-----------");
		        getAllCars(l);
		        break;
		case 2: System.out.println("----------All Cars of a Prticular Brand-------");
	         	getCarOfBrand(l);
		        break;
		case 3: System.out.println("----------All Cars of a Prticular Year----------");
		        getCarFromYear(l);
		        break;
		       
		default: System.out.println("--------This is Invalid Option-------");
		        selectOption();
		 }     
	   }  while(true);
		   
	}
	
	public void getAllCars(List<Car> l) {
		
		for(Car x:l) {
			
			//System.out.printf("%-12s %-6d %.2f %-8s %-15s%n",x.brand,x.year,x.price,x.type,x.model_name);
			System.out.println(x);
		}	
	}
	public void getCarOfBrand(List<Car> l) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Brand: ");
		String brand = sc.nextLine();
		for(Car x:l) {
			if(x.brand.equalsIgnoreCase(brand)) 
			    System.out.println(x);	
			
		}
		
	}
	public void getCarFromYear(List<Car> l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Car Year: ");
		int year = sc.nextInt();
		for(Car x:l) {
			if(x.year==year)
				System.out.println(x);
		}
				
	}
}
