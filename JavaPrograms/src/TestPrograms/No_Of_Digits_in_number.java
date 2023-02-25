package TestPrograms;

import java.util.LinkedList;
import java.util.List;

public class No_Of_Digits_in_number {

	public static void main(String[] args) {

		int num = 12345678;

		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}

		System.out.println(count);

	}

}
