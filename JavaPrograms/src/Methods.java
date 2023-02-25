
public class Methods {

	  public static void main(String[] args) {
		// static method
		
		

		
		double a = 5;
		double b = 6;
		double c = 8;
		
		double maxvalue = maximumvalue(a, b, c);
		
		System.out.println(maxvalue);
	}

	public static double maximumvalue(double a, double b, double c) {
		double max =a;
		 if (b>max) {
			 max=b;
		 }
		 else if (c>max) {
			 max=c;
		 }
		
		return max; 
	
	
	
	}
	
	// own method or user defined method 
	
	/* public static double maximumValue (double a, double b, double c) {
		double max =a;
		 if (b>max) {
			 max=b;
		 }
		 else if (c>max) {
			 max=c;
		 }
		
		return max;

	}*/
	
	

}
