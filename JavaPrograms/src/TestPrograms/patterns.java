package TestPrograms;

import java.util.Scanner;

public class patterns {

	public static void main(String[] args) {

		int no_rows, row, coloumn;

		System.out.println("Enter the number of rows");
		Scanner s = new Scanner(System.in);
		no_rows = s.nextInt();

		for (row = 1; row <= no_rows; row++) {

			for (coloumn = 1; coloumn <= row; coloumn++) {
				System.out.print("*");

			}

			System.out.println();
		}
		
		for (row =no_rows-1; row >= 1; row--) {

			for (coloumn = 1; coloumn <= row; coloumn++) {
				System.out.print("*");

			}

			System.out.println();
		}
		

		/*
		 * output
		 *
		 **
		 ***
		 */
		
		// To get the following o/p the change has to be made to the for loop
			// for (row =no_rows; row >= 1; row--)
		

	}
}








