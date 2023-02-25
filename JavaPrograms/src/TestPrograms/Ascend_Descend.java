package TestPrograms;

public class Ascend_Descend {

	public static void main(String[] args) {
		int[] a = { 5, 2, 8, 7, 1, 9 };
		int temp = 0;

		System.out.println("Original array");
		for (int i = 0; i <=a.length-1; i++) {
			System.out.print(a[i]);
		}

		for (int i = 0; i <=a.length-1; i++) {

			for (int j = i; j <=a.length-1; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println();

		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in descending order: ");

		for (int j = 0; j <=a.length-1; j++) {
			System.out.print(a[j]);
		}

	}

} // for ascending just change the condition to a[i]> a[j]
