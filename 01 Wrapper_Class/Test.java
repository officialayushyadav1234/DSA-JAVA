package Wrapper_Class;

public class Test {

	public static void getResult (Object o){
		
		if(o instanceof Integer) {
			
			System.out.println("It is Integer type");
			int x = (Integer)o;
			System.out.println(x+100);
		}
		
		else if(o instanceof Double) {
			
			System.out.println("It is Double type");
			double x = (Double)o;
			System.out.println(x+100);
		}
		
        else if(o instanceof String) {
			
			System.out.println("It is String type");
			String x = (String)o;
			System.out.println("Length of" +x+ "is:"+x.length());
		}
	}
}
