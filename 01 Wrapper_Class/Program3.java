package Wrapper_Class;

public class Program3 {

	public static void main(String[] args) {
		
		Object o1 = 12;
		Object o2 = 45.54;
		Object o3 = true;
		Object o4 = '@';
		Object o5 = "Mohan";
		System.out.println(o1);
		System.out.println("==========================");
		System.out.println((Integer)o1+100);    // Downcast Object into Integer
		System.out.println("==========================");
		System.out.println((Double)o2+100);    // Downcast Object into Double 
		System.out.println("===========================");
		System.out.println(((String)o5).length());   // Downcast Object into String
		System.out.println("==========================");
		System.out.println(((String)o5).toUpperCase());
	}
}
