import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println("Enter the marks and wait for your results");

		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();


		
	// System.out.println("your mark is "+ marks);

		switch (marks) {

		case (1): if (marks<40) System.out.println("your mark is "+ marks + "  "+"your are failed");break;
	//	case 2: if (marks > 80)System.out.println("Your mark is"+ marks + "  " +"you have got distinction");
	//	case 3: if (marks >= 40 && marks <= 79)System.out.println("Your mark is"+ marks + "  " + "you average and need to fuck off!!!!!!");break;
	//	default:System.out.println("you are unfit!!!!");

		} 

	}

}
