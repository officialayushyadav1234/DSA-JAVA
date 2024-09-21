package Wrapper_Class;

public class Program2 {

	public static void main(String[] args) {
		
		double x = 20.45;
		Double y=x;       //Boxing 	
		Double p = new Double(x);
		System.out.println(x+100);
		System.out.println(y+100);
		System.out.println(p+100);
	}
}
