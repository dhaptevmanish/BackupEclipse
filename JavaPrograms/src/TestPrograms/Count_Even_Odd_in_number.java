package TestPrograms;

public class Count_Even_Odd_in_number {

	public static void main(String[] args) {

		int num = 12345;

		int even_count = 0;
		int odd_count = 0;

		while (num > 0) // coz if the num is 0 its neither odd nor even
		{
			int rem = num % 10; // this will return the last value only from the number i.e returns 5 from 12345

			if (rem % 2 == 0) {
				even_count++;

			} else {
				odd_count++;
			}
			num = num / 10; // this is eliminate the last digit by dividing
		}

		System.out.println("Odd count" + odd_count);

		System.out.println("Even count" + even_count);

	}

}
