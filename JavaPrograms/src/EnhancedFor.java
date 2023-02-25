
public class EnhancedFor {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		/*for (int k : a) {
			System.out.println(k);
		}*/

		int d [] [] = { {1,2},{36,56}};
		
		// its basically to get into the first element in the first array of array
		
		for (int k[]:d) {  // creating a new variable and passing d value to k 
			
			for(int l:k) { // again creating a new variable and passing the k value to l
				
				System.out.print(l);
			}
			System.out.println();

		}
		
		
		
	}

}
