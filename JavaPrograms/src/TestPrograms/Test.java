package TestPrograms;

public class Test {
	
	
	public static void main(String[] args) {
		
		int num =12345; int num2 = 0;
		
		while (num>1) {
			num2 = num%10;
			num = num/10;
			
		}
		
		System.out.println(num2);
	}

}
