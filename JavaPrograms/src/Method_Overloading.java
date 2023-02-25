
public class Method_Overloading {
	
	// same method name with different parameters 
	
	public static void main (String[] args) {
		
		int i=5;
		double d=8;
		
		System.out.println(square(i));
		System.out.println(square(d));

	}
	
	
	
	public static int square (int a) {
		return a*a;
	}
	
	public static double square (double a) {
		return a*a;
		
	}
}
