package String;

public class Stringreverse {

	public static void main(String[] args) {

		// string reverse
		String s = "manish";

		for (int i = s.length() - 1; i >= 0; i--) {
			char rev = s.charAt(i);
			System.out.print(rev);

		}
	}

}
