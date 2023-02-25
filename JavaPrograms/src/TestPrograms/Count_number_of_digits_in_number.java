package TestPrograms;

import java.util.Scanner;

public class Count_number_of_digits_in_number {

	public static void main(String[] args) {

		int num , digit,count=0;
		
		Scanner sc = new Scanner (System.in);
		num = sc.nextInt();
		
		while (num>0) {
		
		digit = num%10; // returns the last number as reminder 
		
		count = digit/10;
		count++;
		
		System.out.println(count);
		
		}
		
		

	}

}
