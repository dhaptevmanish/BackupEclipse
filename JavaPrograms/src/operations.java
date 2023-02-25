import java.util.Scanner;

public class operations {

	public static void main(String[] args) {

		/*
		 * ALl the arithmetic operations are done from left to right // only the =
		 * operation is done from right to left
		 * 
		 * 1. (), /, *, % - evaluated first 2. +,- - evaluated second 3. = <> are evaluated at
		 * the last
		 */

		int a, b, c;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a");
		a = s.nextInt();
		System.out.println("Enter value of b");
		b = s.nextInt();
		System.out.println("Enter value of c");
		c = s.nextInt();

		// int result = a * b + c;

	//	System.out.println("output is " + result);

		

		// equality and relational operators

		/*
		 * == equal to 
		 * != not equal to 
		 * > greater than  >= greater than or equal to 
		 * < less than <= less than or equal to
		 */
		
		
		if(a>b) {
			System.out.println("a is > than b");
				}
		else if (b>a) {
			System.out.println("b is > than a");
			
			}
		 if(a==b) {
		System.out.println("both are same");
				}
		 else {
			System.out.println("both are different");	
			}
		 s.close();
	}

}
