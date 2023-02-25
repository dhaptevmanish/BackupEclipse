package TestPrograms;

import java.util.Scanner;

public class Largest_of_givenNumbers {
	
	public static void main (String[] args) {
		
		System.out.println("Enter 3 numbers");
		
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		
		// using the genral logic
		
//		if(a>b &&a>c) {
//			System.out.println("a is >");
//		}
//		else if (b>a && b>c) {
//			System.out.println("b is >");
//		}
//		
//		else System.out.println("c is >");	
//		
		// using ternary operator 
		
		int largest = a>b?a:b; // if a>b is true then o/p will be "a" or if a>b is false then o/p will be "b"
		largest = c>largest?c:largest;
		
		System.out.println("largest is"+ largest);
		
		
	}

}
