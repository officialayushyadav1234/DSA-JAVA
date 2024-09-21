package Wrapper_Class;

public class Program6 {

	public static void main(String[] args) {
		
		Boolean b1 = true;   //true
		Boolean b2 = false;  //false
		
		Boolean b3 = new Boolean(true);    //true
		Boolean b4 = new Boolean(false);   //false
		Boolean b5 = new Boolean("True");  //true
		Boolean b6 = new Boolean("TrUe");  //true
		Boolean b7 = new Boolean("False"); //false
		Boolean b8 = new Boolean("Mohan"); //false
		Boolean b9 = new Boolean("@hcdn"); //false
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);
		System.out.println(b9);
	}
}
