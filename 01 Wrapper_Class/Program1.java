package Wrapper_Class;

public class Program1 {

	public static void main(String[] args) {
		
		int x=10;
		Integer y=x;   // Boxing
		Integer p = new Integer(x);
		System.out.println(x+100);
		System.out.println(y+100);
		System.out.println(p+100);
	}
	
}
