package TestPrograms;

public class Swapping_of_numbers {

	public static void main(String[] args) {
		
		
	
		
		int a = 5;
		int b = 10;
		System.out.println("The values before swap is"+ " "+a+b);

		// logic 1 using a third variable we are doing this 
//		int c = a;
//		System.out.println(c);
//		a = b;
//		b = c;
		
		
		// logic 2 - using + and - 

//		a = b+a; // 10+ 5 a value is 15 
//		b= a-b; // 15-10 b value is 5
//		a = a-b; // 15-5 a value is 10
		
		// logic 3 using * and / operators and the a & b values must not be zero 
		
//	b=a*b;		// 10*5 = 50  b value is 50
//	a =	b/a;		// 50/5 = 10 a value is 10 
//	b= 	b/a;			// 50/10 = 5 b value is 5
	
	// logic 4 using bitwise XOR operator(^) // carat operator 
	
	// XOR table is if there are 2 diff inputs the value will be 1
//	a = a^b; // a will be 30 after this
//	b= a^b; // b will be 5 after this
//	a= a^b; // a will be 10 after this 
	
		// using just a line
		
		b= a+b -(a=b);
		
		
		
		
		System.out.println("The values after swap is"+" "+a+b);

		
		
	}

}
