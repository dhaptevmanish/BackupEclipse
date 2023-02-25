package TestPrograms;

import java.util.Scanner;

/*
prime number is a number which has exactly two factors i.e. ‘1’ and the number itself.composite number has more than two factors, 
which means apart from getting divided by 1 and the number itself, it can also be divided by at least one positive integer. 
*/
public class Prime {
	public static void main(String[] args) {
		int num, i, count=0;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      num = s.nextInt();
	      
	      for(i=2; i<num; i++)
	      {
	         if(num%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	         System.out.println("\nIt is a Prime Number.");
	      else
	         System.out.println("\nIt is not a Prime Number.");
	}

}
