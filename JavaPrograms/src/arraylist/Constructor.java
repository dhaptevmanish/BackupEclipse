package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constructor {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>(30);

		int counter = 0;

		for (String s : a) {
			counter++;
		}
		System.out.println("No argument with capacity" + counter);
		System.out.println();

		String sArray[] = { "element1", "element2" };
		List<String> list = Arrays.asList(sArray);
		ArrayList<String> b = new ArrayList<String>(list);
		b.add("element3");
		
//		b.clear();
// 		b.remove("element3");		

		for (String s : b) {
			System.out.println("new value is" + s);
		}
		System.out.println(b);
		


	}
}
