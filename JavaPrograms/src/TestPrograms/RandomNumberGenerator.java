package TestPrograms;

import java.util.Random;

public class RandomNumberGenerator {
	
	
	public static void main(String[] args) {
		
		
		Random randomnumber = new Random();
		
		for (int i=0;i<5;i++) {
			int num = randomnumber.nextInt(10);
			System.out.println(num);
			
		}
	}
}
