
public class Array_argument {
	public static void main (String args[]) {
		
		int[] i= {5,6}; // if we just point 
		
		System.out.println("value of i before increment"+i[0]);
		modify(i);
		System.out.println("value of i before increment"+i[0]);

	}
	
	public static void modify(int[] i) {
		i[0]++;
		
	}
	

}
