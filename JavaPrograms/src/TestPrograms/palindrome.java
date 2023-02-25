package TestPrograms;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// to reverse a string
//	      String strInput = "madam";
//	      StringBuffer sb = new StringBuffer(strInput);
//	      sb.reverse();
//	      String str = sb.toString();
//	      if(strInput.equals(str))
//	      {
//	         System.out.println(str + " string is palindrome.");
//	      }
//	      else
//	      {
//	         System.out.println(str + " string is not palindrome.");
//	      }

		// to reverse a number using StringBuffer

		System.out.println("Enter a number");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		StringBuffer s = new StringBuffer(String.valueOf(num)); // cnvrting int to stringbuffer

		StringBuffer rev = s.reverse(); // reversing the string buffer
		String str = rev.toString(); // converting the stringbuffer to string

		int num1 = Integer.parseInt(str); // converting the string to int

		if (num == num1) {
			System.out.println("palindrome");
		}

		else
			System.out.println("no pali11ndrome ");

	}

}

//	we can also rev the number using the frmula and then use if else to compare 2 values and then say if its palindrome or not 
// int rev = 0;
//
//		while (num != 0) {
//			rev = rev * 10 + num % 10;
//			num = num / 10;
