package TestPrograms;

import java.nio.ShortBuffer;
import java.util.Scanner;

public class Reverse_numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println(num);
		int num1 = num;

		// Scenario 1 using alogorithm

	int rev = 0;

		while (num != 0) 
		{
		rev = (rev * 10) + (num % 10); // 
		num = num / 10;

	}
		

		System.out.println(rev);
		
		if (rev==num1) {
			System.out.println("palindrome");}
			else {
				System.out.println("not palindrome");
			}
		}
		
		// Scenario 2 stringbuffer 
		
		
//		StringBuffer s = new StringBuffer(String.valueOf(num));		// using this we can cnvrt the int to a string function
//		 StringBuffer rev1= s.reverse();
//		 System.out.println(rev1);
		 
		 // using string builder 
//		 
//		 StringBuilder s1 = new StringBuilder(String.valueOf(num));
//		 // s1.append(num); // we can use this add the int data into string
//	StringBuilder	 rev2 = s1.reverse();
//	System.out.println(rev2);
		 
		 

	}

