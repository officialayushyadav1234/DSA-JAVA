package Wrapper_Class;

public class Program5 {

	public static void main(String[] args) {
		
		Integer x = 45;    // non-primitive data
		//int y = x;
		
		int y=x.intValue();   // primitive data
		System.out.println(x.intValue()+100);
	}
}
