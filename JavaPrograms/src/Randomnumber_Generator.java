import java.util.Random;

public class Randomnumber_Generator {

	public static void main(String[] args) {
		
		Random randomnum = new Random();
		
		int a =  1+ randomnum.nextInt(10); // this is used so that we dont get 0 as a value in the output
		
		System.out.println("the random number is" + a);
		
		
	}

}
