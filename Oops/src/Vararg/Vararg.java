package Vararg;

public class Vararg {
	
	
	public static void main (String [] args) {
	
		m1();
		m1(10);
		m1(10,20);
		
	}
	
	public static void m1(double...x){
		
		System.out.println("The value of x now is" + x);
		
	}
	
	

}
