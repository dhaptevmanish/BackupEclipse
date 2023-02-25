package TestPrograms;

public class Binary_addition {

	public static void main(String[] args) {
		
		String s1 = "1010";
		String s2 = "10";
		
		int num1 = Integer.parseInt(s1, 2);
		int num2 = Integer.parseInt(s2, 2);
		
		int sum = num1+num2;
		
		System.out.println("Binary sum is"+ Integer.toBinaryString(sum));

	}
	
}
